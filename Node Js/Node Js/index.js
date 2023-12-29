import express from "express";
const app = express();
import path from "path";
import mongoose from "mongoose";

mongoose
  .connect("mongodb://localhost:27017", { dbName: "Backend" })
  .then((c) => console.log("Database connected"))
  .then((e) => console.log(e));

const users = [];
var index = -1;

// Using MiddleWares
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(path.resolve(), "public")));

// Setting up View Engine
app.set("view engine", "ejs");

app.get("/", (req, res) => {
  res.render("index");
});

app.get("/add", (req, res) => {
  res.send("Nice");
});

app.get("/success", (req, res) => {
  res.render("success", { name: users[index].name, email: users[index].email });
});

app.post("/contact", (req, res) => {
  index++;
  users.push({ name: req.body.name, email: req.body.email });
  res.redirect("/success");
});

app.get("/users", (req, res) => {
  res.json({
    users,
  });
});

app.listen(5000, () => {
  console.log("Server is working");
});
