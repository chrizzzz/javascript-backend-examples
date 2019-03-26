const express = require("express");
const app = express();
const port = 3000;

app.get("/tea", (req, res) => res.send("Here is you new hot cup of tea "));

app.listen(port, () =>
  console.log(`Beverage server is listening on port ${port}!`)
);
