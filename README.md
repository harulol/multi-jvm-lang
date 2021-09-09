<div align="right">

![GitHub Workflow Status](https://img.shields.io/github/workflow/status/harulol/multi-jvm-lang/gradle?style=plastic) ![GitHub](https://img.shields.io/github/license/harulol/multi-jvm-lang?style=plastic) ![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/harulol/multi-jvm-lang?include_prereleases&style=plastic)
</div>

<div align="center">

## MultiJVMLang
Introduces Kotlin's, Scala's and Groovy's libraries to Bukkit's and Bungee's classpaths.
</div>

### Versioning
This will be a bit confusing since this shades multiple libraries into one jar, instead of multiple jars holding each library and versioned according to the library they hold.

The version of this project should be in the format `MAJOR.MINOR.PATCH`:
- When `PATCH` is `0`, it can be omitted.
- `PATCH` goes up by 1 when at least a library's `PATCH` version increases.
- `MINOR` goes up by 1 when at least a library's `MINOR` version increases.
- `MAJOR` goes up by 1 when at least a library's `MAJOR` version increases.

### Currently shadowing
| Library | Version |
|---|---|
| `kotlin-stdlib` | `1.5.30` |
| `kotlin-reflect` | `1.5.30` |
| `kotlinx-coroutines-core` | `1.5.2-native-mt` |
| `kotlinx-serialization-core` | `1.2.2` |
| `groovy-all` | `3.0.9` |
| `scala3-library_3` | `3.1.0-RC1` |

### FaQs
<details>
<summary>How to install?</summary>

Just like any other plugin! By using the provided and very self-explanatory `plugins` folder?
</details>

<details>
<summary>Why?</summary>

So plugin developers using these languages don't have to shadow in the standard libraries of these languages for them to be usable.
</details>

<details>
<summary>Resolving this as development dependency?</summary>

No. Just use the language's provided libraries. If you use this, you must have like all 4 languages in the project lol.
</details>

<details>
<summary>There are files that do nothing useful in src</summary>

Yea, because they only serve as entrypoints for Bukkit and Bungee to recognize and load the classes.
</details>

<details>
<summary>Dependency at runtime?</summary>

Properly the same for both `bungee.yml` and `plugin.yml`.
```yaml
depend: [MultiJVMLang]
```
</details>

### Legal Notice
All 3 languages' libraries are licensed under **Apache License 2.0** by their respective owners and contributors.

This project is not official and not affiliated with the Kotlin Foundation, Codehaus, EPDL or JetBrains and any of their sponsors and affiliates.