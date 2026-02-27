[![Paper](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/paper_vector.svg)](https://papermc.io)
[![Purpur](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/purpur_vector.svg)](https://purpurmc.org)
[![Bukkit](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/bukkit_vector.svg)](https://dev.bukkit.org/)
[![Spigot](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/spigot_vector.svg)](https://www.spigotmc.org/)
[![BungeeCord](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/bungeecord_vector.svg)](https://www.spigotmc.org/wiki/bungeecord/)

---

# 🟢 CustomJoin – Modern Join & Leave Messages

✨ A lightweight, modern and fully customizable join/leave message plugin for Paper 1.21.
Built with Adventure & MiniMessage for clean formatting and full RGB support.

---

## 🚀 Features

* 🎨 Fully customizable join & leave messages
* 🌈 MiniMessage support (RGB, gradients, hover, click events)
* 🏷 Configurable welcome title on join
* ⚡ Lightweight & optimized
* 🧩 100% built for Paper 1.21
* 🔥 No outdated Bukkit APIs

---

## 📦 Configuration Example

```yaml
join-message: "<green>[+]</green> <white>%player%</white> <green>joined the server!</green>"
leave-message: "<red>[-]</red> <white>%player%</white> <red>left the server!</red>"

title-on-join: true

title:
  main: "<gradient:#00ff00:#00ffff>Welcome %player%!</gradient>"
  sub: "<gray>Enjoy your stay</gray>"

title-times:
  fade-in: 10
  stay: 70
  fade-out: 20
```

---

## 🧠 Why CustomJoin ?

Unlike basic join message plugins, CustomJoin:

* Uses **Adventure API**
* Supports **MiniMessage formatting**
* Allows **full RGB & gradient support**
* Is designed specifically for modern Paper servers

No legacy code. No unnecessary dependencies. Just clean and modern.

---

## 🔧 Requirements

* Java 17+
* Paper 1.21+

---

## 📌 Installation

1. Download the latest version
2. Put the `.jar` in your `/plugins` folder
3. Restart your server
4. Edit `config.yml` to customize

---

## 💡 Planned Features (optional future updates)

* PlaceholderAPI support
* LuckPerms prefix integration
* First join message
* Per-permission join messages
* Reload command
* Animated messages

---

## ❤️ Support

If you enjoy the plugin, consider leaving a rating on Modrinth!

---
