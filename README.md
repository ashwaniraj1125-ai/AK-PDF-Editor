# AK PDF Editor Complete — Android Studio project

## Implemented in this project
- Open and view PDFs; previous/next page navigation
- Freehand drawing and a highlight-style marker overlay
- Add simple text labels to the current page
- Save current-page annotations into a new PDF in Downloads
- Convert one image to a PDF
- Merge multiple PDFs
- Remove the last page and save a copy

## Not implemented yet
- Editing/replacing existing PDF text (this requires text extraction/layout-aware editing)
- Reliable split/export of arbitrary page ranges
- PDF-to-Word conversion with preserved formatting
- Password encryption/decryption
- Full annotation placement controls, undo/redo, multi-page annotation persistence

## Build the APK
Open this folder in Android Studio, allow Gradle sync and run on a device.
For an APK: Build > Build Bundle(s) / APK(s) > Build APK(s).

This is a source project, not a prebuilt APK. Review/test on a device before relying on output. Requires internet during Gradle sync to download PDFBox Android.

## Build APK using GitHub Actions from a tablet

1. Create a GitHub account and a new repository.
2. Upload the contents of this project (including the hidden `.github` folder) to the repository's `main` branch.
3. Ensure the Gradle wrapper files exist: `gradlew`, `gradlew.bat`, and `gradle/wrapper/gradle-wrapper.jar` plus `gradle-wrapper.properties`. These are required by the workflow. This source archive may not include the wrapper; if absent, generate it from a compatible Gradle installation or Android project template.
4. Open the repository's **Actions** tab and run **Build AK PDF Editor APK** using **Run workflow**.
5. When the run completes successfully, open the run and download the artifact named `AK-PDF-Editor-debug-apk`.

Note: workflow is supplied, but this project has not been validated by a successful remote build. The Gradle wrapper must be present for the workflow to run.
