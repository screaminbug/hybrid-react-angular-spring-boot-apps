import React, { Component } from 'react';
import './App.css';
import Button from "@material-ui/core/Button";
import {Bookmarks} from "@material-ui/icons";
import Navbar from "./Navbar";
import TextField from "@material-ui/core/TextField";
import MediaCard from "./Card";


class App extends Component {
    render() {
        return (
            <div>
                <Navbar />
                <Button variant="outlined" color="primary">
                    <Bookmarks></Bookmarks>
                </Button> <br />
                <TextField
                    placeholder="Placeholder here"
                    label="Basic TextField" />
                <MediaCard />
            </div>
        );
    }
}

export default App;
