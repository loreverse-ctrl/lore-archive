# LOREVERSE Native Android v2.0

Standalone Kotlin + Jetpack Compose application (not a WebView / Capacitor wrapper).

## Project
- Application ID: `mn.loreverse.app`
- Minimum Android: API 26; compile / target SDK: API 36
- JDK: 17; Jetpack Compose + Material 3
- Supabase Kotlin SDK: Auth + PostgREST modules

## Build a debug APK
From this directory run `gradle assembleDebug`. The debug build uses the `.debug` application ID suffix so it can be installed alongside the current app. Release retains `mn.loreverse.app`.

## Supabase
The native app points to the existing LOREVERSE Supabase project using the public publishable key already used by the website. This is not a service-role secret. Database access must remain protected by Row Level Security. `ArchiveRepository` reads only published `archive_franchises` rows.

## Current scope and release gates
The UI currently has onboarding, Home, Anime, Manga, Games, Lore, detail, Profile and Settings screens with local navigation. A Supabase client and published-franchise repository are added, but sign-in/sign-up screens are not yet wired to Auth and the screens still use sample content. Chat, payments/membership, remote images, push notifications, production signing and physical-device tests are not complete. Do not distribute as a production replacement until these are implemented and tested.

## Upgrade compatibility
Updating an existing installation requires the same application ID and original signing certificate/private key. Never commit keystores or passwords.
