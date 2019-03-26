const mqtt = require("mqtt");
var app = require("express")();
var server = require("http").Server(app);
var socketServer = require("socket.io")(server);

const port = 3000;

app.get("/tea", (req, res) => res.send("Here is your fresh hot cup of tea 🍵"));

app.get("/water", (req, res) =>
  res.send("Here is your fresh cold glass of water 💧")
);
app.get("/coffee", (req, res) =>
  res.send("Here is your new fresh hot cup of coffee ☕️")
);

server.listen(3001, () => {
  console.log("blubber");
});

socketServer.on("connect", socket => {
  console.log("connected to socket");

  socket.on("disconnect", () => {
    console.log("Disconnected");
  });

  const mqttClient = mqtt.connect("mqtt://localhost:5672");

  mqttClient.on("connect", () => {
    console.log("connceted with mqtt");
    mqttClient.subscribe("water");
    mqttClient.subscribe("tea");
    mqttClient.subscribe("coffee");
  });

  mqttClient.on("message", function(topic, message) {
    console.log(topic, message.toString());
  });
});

app.listen(port, () =>
  console.log(`Beverage server is listening on port ${port}!`)
);
