const express = require("express");
const app = express();
const port = 3000;

app.get("/tea", (req, res) => res.send("Here is your fresh hot cup of tea 🍵"));

app.get("/water", (req, res) =>
  res.send("Here is your fresh cold glass of water 💧")
);
app.get("/coffee", (req, res) =>
  res.send("Here is your new fresh hot cup of coffee ☕️")
);

app.listen(port, () =>
  console.log(`Beverage server is listening on port ${port}!`)
);
