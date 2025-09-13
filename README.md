# Calculator Mod
A simple client-side chat calculator.

## Overview
Calculator Mod allows you to evaluate mathematical expressions directly from the chat.  
Simply start your message with `@` followed by a formula, and the result will be displayed in your chat.

**Features:**
- Evaluate arithmetic expressions using double precision.
- Optional inline or multi-line result display (configurable).
- Client-side only: does not require server installation.
- Configurable warnings and display options.

---

## Usage
Type a calculation in the chat starting with `@`

---

## Configuration

The mod provides a client-side configuration file (`config/calculator-client.toml`) with the following options:

| Option            | Description                                                | Default |
|-------------------|------------------------------------------------------------|---------|
| `suppressWarning` | Suppress a warning on login about possible rounding errors | false   |
| `resultInline`    | Display calculation results in the same line as input      | false   |

**Note:**
This calculator uses double precision. Results may contain rounding errors.

---

## License

**Calculator Mod:** MIT License

**Third-party libraries:**
- [exp4j](https://www.objecthunter.net/exp4j) — Apache License 2.0  
  (Source code included with license header preserved)