# Distributed Lock Documentation

This directory contains the AsciiDoc documentation for the Distributed Lock plugin.

## Building Documentation

To build the documentation locally:

```bash
./gradlew :distributed-lock-docs:asciidoctor
```

The generated HTML documentation will be available in `distributed-lock-docs/build/docs/`.

## Viewing Documentation

After building, open `distributed-lock-docs/build/docs/index.html` in your browser.

## Publishing

Documentation is automatically published to GitHub Pages when changes are pushed to the `master` or `main` branch via the `.github/workflows/publish-docs.yml` workflow.

The published documentation is available at: https://wondrify.github.io/distributed-lock/

## Structure

- `src/docs/asciidoc/index.adoc` - Main documentation page with installation, configuration, and usage
- `src/docs/asciidoc/advanced.adoc` - Advanced usage guide with detailed examples and patterns

## Editing Documentation

Documentation is written in AsciiDoc format. Key conventions:

- Use `[source,groovy]` for Groovy code examples
- Use `[source,java]` for Java code examples
- Keep examples practical and complete
- Use the `:project-version:` attribute for version references
