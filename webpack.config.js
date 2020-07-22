const HtmlWebpackPlugin = require("html-webpack-plugin");
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const path = require("path");
const webpack = require("webpack");
module.exports = (env, argv) => {
  const isDevMode = (argv.mode || "production") !== "production";
  console.log(isDevMode)
  const config = {
    entry: "./src/index.tsx",
    mode: isDevMode ? "development" : "production",
    output: {
      filename: "[name].bundle.js",
      path: path.resolve(__dirname, 'dist')
    },
    resolve: {
      extensions: [".ts", ".tsx", ".js", ".scss"],
      alias: {
        "react-dom": isDevMode ? "@hot-loader/react-dom" : "react-dom"
      }
    },
    module: {
      rules: [
        {
          test: /\.tsx?$/,
          use: isDevMode
            ? [
              {
                loader: "babel-loader",
                options: {
                  babelrc: true,
                  plugins: ["react-hot-loader/babel"]
                }
              },
              "ts-loader"
            ]
            : ["ts-loader"]
        },
        {
          test: /\.(sa|sc|c)ss$/,
          use: [
            isDevMode ? "style-loader": MiniCssExtractPlugin.loader,
            { loader: "css-loader", options: { sourceMap: true } },
            { loader: "resolve-url-loader" },
            {
              loader: "sass-loader",
              options: {
                implementation: require("sass"),
                sourceMap: true,
                webpackImporter: false,
                sassOptions: {
                  includePaths: ["node_modules"]
                }
              }
            }
          ]
        }
      ]
    },
    devtool: "cheap-source-map",
    plugins: isDevMode ? [
      new HtmlWebpackPlugin({ template: "./index.html", filename: "index.html", inject: "body" })
    ] : [
      new MiniCssExtractPlugin({ filename: "[name].bundle.css" })
    ]
  };

  if (isDevMode) {
  }
  return config;
}
