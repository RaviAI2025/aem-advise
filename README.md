# AEM Advise

Adobe Experience Manager project for Advise site.

## Modules

- **core**: Java/OSGi bundle with Sling Models, Servlets, and Filters
- **ui.apps**: AEM components, templates, and clientlibs under `/apps/advise`
- **ui.content**: Content pages under `/content/advise`
- **ui.config**: OSGi configurations

## Build

```bash
mvn clean install
```

## Deploy to AEM

```bash
mvn clean install -PautoInstallSinglePackage
```
