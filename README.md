# teamcityproject

A minimal Node.js sample project to learn TeamCity.

This repository contains a tiny Node.js app, a test, and an example TeamCity Kotlin DSL configuration so you can import the project into TeamCity and see builds run.

## What is included

- `package.json` - npm scripts to build and test.
- `index.js` - tiny app entry (prints Hello).
- `lib/sum.js` - small function we test.
- `test.js` - simple test runner using Node's assert.
- `.teamcity/settings.kts` - example TeamCity Kotlin DSL that defines a VCS root and a Build configuration which runs `npm install` and `npm test`.
- `.gitignore` - ignores `node_modules`.

## Run locally

1. Install Node.js (>= 14).
2. From the repository root:

```bash
npm install
npm test
```

You should see `All tests passed`.

## Using this repository with TeamCity (quick path)

1. Push this repository to a Git hosting service (GitHub/GitLab/Bitbucket).
2. In TeamCity, create a new project and choose "Create project from VCS" (or import project settings from versioned settings).
3. Point TeamCity to this repository.
4. If you use the Kotlin DSL (`.teamcity/settings.kts` is present), enable "Use settings from VCS" so TeamCity will create the build configuration automatically.

The example Kotlin DSL defines a build that runs `npm install` then `npm test` on every VCS change.

## TeamCity Kotlin DSL notes

- The provided `.teamcity/settings.kts` is an example. You may need to adjust the VCS URL to match your repository and the Kotlin DSL API version depending on your TeamCity server.

## Next steps / learning exercises

- Add a linter and a lint step in the TeamCity build.
- Add code coverage reporting and collect artifacts in TeamCity.
- Convert the tests to a test framework (Mocha/Jest) and add a Test Report tab in TeamCity.

Happy learning!

# teamcityproject
