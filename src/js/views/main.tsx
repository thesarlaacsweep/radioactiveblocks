import { hot } from "react-hot-loader"; // tslint:disable-line:no-implicit-dependencies
import React from "react";
import {
    Container,
    AppBar,
    Toolbar,
    Typography,
    Avatar,
    ThemeProvider,
} from "@material-ui/core";
import { VerticalTabs } from "../components/vertical_tabs";
import { UI_THEME } from "../util/constants";

export function Main(): JSX.Element {
    return (
        <ThemeProvider theme={UI_THEME}>
            <Container component="div">
                <AppBar position="static" color="primary">
                    <Toolbar style={{ justifyContent: "space-between" }}>
                        <Typography variant="h6">
                            Radioactive Blocks Documentation
                        </Typography>
                        <Avatar
                            alt="TheSarlaacSweep author of Radioactive Blocks"
                            title="TheSarlaacSweep author of Radioactive Blocks"
                            src="https://avatars1.githubusercontent.com/u/66019754?s=400&u=9fe28a9c60f22ccfb3b8becbef810952ef85e76c&v=4"
                        />
                    </Toolbar>
                </AppBar>
                <VerticalTabs />
            </Container>
        </ThemeProvider>
    );
}

export default hot(module)(Main); // tslint:disable-line:no-default-export
