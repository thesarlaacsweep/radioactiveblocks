module.exports = {
  plugins: ["stylelint-order", "stylelint-scss"],
  rules: {
    "extends": "stylelint-config-sass-guidelines",
    "rules": {
      "indentation": 4,
      "string-quotes": "double",
      "no-duplicate-selectors": true,
      "color-hex-case": "upper",
      "color-hex-length": "short",
      "selector-no-id": true,
      "declaration-block-trailing-semicolon": "always",
      "declaration-colon-space-before": "never",
      "declaration-colon-space-after": "always",
      "value-no-vendor-prefix": true,
      "number-leading-zero": "always",
      "font-family-name-quotes": "always-where-recommended",
      "at-rule-no-vendor-prefix": true,
      "selector-no-vendor-prefix": true,
      "selector-no-universal": true,
      "media-feature-name-no-vendor-prefix": true,
      "at-rule-no-unknown": null,
      "scss/at-rule-no-unknown": false
    }
  }
};