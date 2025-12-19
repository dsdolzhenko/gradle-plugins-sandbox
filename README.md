# Gradle Plugins Sandbox

A demonstration project showing how [gradle-secrets-plugin](https://github.com/dsdolzhenko/gradle-secrets-plugin) and [gradle-dotenv-plugin](https://github.com/dsdolzhenko/gradle-dotenv-plugin) work together to manage secrets in Gradle builds.

## Overview

This sandbox demonstrates the integration of two Gradle plugins:

- **gradle-dotenv-plugin**: Loads environment variables from `.env` files
- **gradle-secrets-plugin**: Resolves secret references (e.g., 1Password URLs) and injects them as environment variables

## Setup

1. Copy the template file:
   ```bash
   cp .env.template .env
   ```

2. Update `.env` with your secret references:
   ```
   SECRET_KEY="op://Personal/Secret/password"
   ```

3. Run the application:
   ```bash
   ./gradlew run
   ```

## How It Works

The plugins work together in this sequence:
1. `gradle-dotenv-plugin` loads variables from `.env` file
2. `gradle-secrets-plugin` detects secret references (like 1Password URLs)
3. Secrets are resolved and injected as environment variables
4. Your application accesses them via `System.getenv()`

See `build.gradle.kts` for plugin configuration.

## License

The project is licensed under the [MIT license](./LICENSE.txt). 