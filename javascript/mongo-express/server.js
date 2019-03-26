var app = require("express")();
const port = 3000;

/*Mongo */
const MongoClient = require("mongodb").MongoClient;

const url = "mongodb://localhost:27017";
const client = new MongoClient(url);

const dbName = "test";

client.connect(function(err) {
  const db = client.db(dbName);

  app.get("/tea", async (req, res) => {
    const collection = db.collection("tea");
    const teas = await collection.find({}).toArray();
    res.send(teas);
  });

  app.get("/water", async (req, res) => {
    const collection = db.collection("water");
    const water = await collection.find({}).toArray();
    res.send(water);
  });

  app.get("/coffee", async (req, res) => {
    const collection = db.collection("coffee");
    const coffee = await collection.find({}).toArray();
    res.send(coffee);
  });
});

app.listen(port, () =>
  console.log(`Beverage server is listening on port ${port}!`)
);
