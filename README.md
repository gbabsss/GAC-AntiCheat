# 🛡️ GAC — GAntiCheat
### _Version 0.1 • Development Build_

> ⚠️ **WARNING**
>
> This project is currently in **early development**.  
> **DO NOT use on public or production servers.**  
> False positives and incomplete detections are expected.

---

## 📌 What is GAC?

**GAC (GAntiCheat)** is a lightweight experimental Minecraft anti-cheat plugin  
designed for **Paper / Spigot 1.20.1+**.

The goal of this project is to explore **movement analysis**, **reach detection**,
and **client behavior heuristics** without packet-level dependencies (yet).

---

## 🚧 Development Status

🟡 **Stage:** Early Development  
🔬 **Type:** Experimental / Research  
❌ **Not production-ready**  
❌ **Not optimized for public servers**

This project is intended for:
- Learning
- Testing
- Private servers
- Anti-cheat research

---

## ✨ Features (v0.1)

- 🏃 Speed limiting (no Speed II / illegal velocity)
- 📏 Reach detection (default reach enforcement)
- 🧠 Client type estimation (Vanilla / Fabric / Forge guess)
- ⬆️ Vertical movement abuse detection
- 📢 OP-only alerts
- 🗂️ File-based logging (`/logs/YYYY-MM-DD.log`)
- 🔁 `/gacreload` command (OP only)

---

## 🧪 Known Issues

- False positives may occur
- No packet-level checks
- No ping or TPS compensation
- Detection logic is **very strict**

---

## 🧩 Planned Features

- Violation buffer system
- Packet-based checks (ProtocolLib)
- AutoClicker / CPS detection
- Velocity & Knockback checks
- Configurable punishments
- Better bot detection logic

---

## 🔐 Permissions

All commands and alerts are **OP-only** by default.

---

## 📜 License

This project is licensed under the **GNU General Public License v3.0**.

✔ You are allowed to:
- Use
- Modify
- Fork
- Redistribute

❗ You **must**:
- Keep the source code open
- Keep this license intact

See the [LICENSE](LICENSE) file for details.

---

## ⚠️ Disclaimer

This anti-cheat is **NOT guaranteed** to be accurate or safe for live servers.

The author takes **no responsibility** for:
- False bans
- Kicks
- Player data loss
- Server issues

Use at your own risk.

---

## ❤️ Contributing

Pull requests and forks are welcome —  
just keep it open-source 😉

---
