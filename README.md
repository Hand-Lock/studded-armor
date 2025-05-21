# Studded Armor: Lost Tier & Chainmail Rework
*A Forge mod for Minecraft 1.20.1 that resurrects the forgotten **Studded** armor set and finally gives Chainmail the recipes it deserved.*

## ⚔️ Why This Exists

Between **December 31 2009** and **February 6 2010** the Indev branch of Minecraft contained a fourth armor set—**Studded**—whose sprites were lifted wholesale from *The Legend of the Chambered 2*. Every new world spawned a full set in the player’s inventory, yet the items offered no protection and could not be equipped. When real armor mechanics arrived a few weeks later, both the items and their textures were deleted, leaving a “missing tier”.
This mod restores that tier with balanced stats, authentic recipes, and progression.

---

## 📜 Historical Timeline

| Java Edition build                   | Date (UTC)              | Event                                                                        |
| ------------------------------------ | ----------------------- | ---------------------------------------------------------------------------- |
| **Indev 0.31 20091231-2**            | 2009-12-31 22:57        | Studded textures added to *items.png* and granted in the starting inventory. |
| **Indev 0.31 20100204-1 → 20100206** | 2010-02-04 → 2010-02-06 | Studded items removed in preparation for armor mechanics.                    |
| **Indev 20100206-2034**              | 2010-02-06              | Studded textures stripped from *items.png*—the set disappears entirely.      |

**Quick facts**

* **Availability (Indev):** Spawned in the starting inventory only; could not be crafted or found.
* **Functionality:** Purely cosmetic inventory items—could be moved but not worn.
* **Sprite origin:** Directly copied from *The Legend of the Chambered 2* where they were named *studded helmet/shirt/pants/boots*.
---

## 🛠️ Crafting & Progression

### 1 ️⃣ Studded Armor (Smithing Table)
Combine **any Chainmail piece** with a **Studded Upgrade Smithing Template** and a **Stud**:

![Studded Upgrade Smithing Template + Chainmail Armor Piece + Stud = Studded Armor Piece](https://cdn.modrinth.com/data/cached_images/03c160c0cde18a0b1402cbb6006c9c491ba66007.png)

---

#### 🔧 Crafting a Stud

![asd](https://cdn.modrinth.com/data/cached_images/227c978354a81feeec780b82f6dce0db982d6db1.png)

```

[N] [N] [N]
[N] [L] [N]
[N] [N] [N]

```
* **L** = Leather Strip
* **N** = Iron Nugget

---

#### 🔧 Crafting a Leather Strip

![asd](https://cdn.modrinth.com/data/cached_images/331bf4ba6d039bfca99e242943512ab84bbab20b.png)

```

[ ] [ ] [ ]
[L] [L] [L]
[ ] [ ] [ ]

```
* **L** = Leather

---

#### 📜 Studded Upgrade Smithing Template
Found while **brushing suspicious sand or gravel** (Archaeology). Gives archaeology real purpose, beyond pottery shards...

---

#### 🛡️ Stat Overview
| Set | Armor (points) | Toughness / piece | Durability (total) |
|-----|---------------|------------------|--------------------|
| Iron | 15 | — | 240 |
| **Studded** | **17** | **+1** | **384** |
| Diamond | 20 | +2 | 528 |

*(Values respect the vanilla ratios between individual pieces.)*

---

### 2 ️⃣ Chainmail Rework
Chainmail is now obtainable **through crafting**:

#### 🔧 Chains

![asd](https://cdn.modrinth.com/data/cached_images/caff5a957b71f2351cacc24a12571883de793384.png)

```

[ ] [N] [ ]
[ ] [N] [ ]
[ ] [N] [ ]

```
* **N** = Iron Nugget → **1 × Chain**

---

#### 🔧 Chainlinks

![asd](https://cdn.modrinth.com/data/cached_images/7fdeeec99f385c0262a01049f860506be5a754f3.png)

```

[ ] [C] [ ]
[C] [ ] [C]
[ ] [C] [ ]

```
* **C** = Chain → **2 × Chainlinks**

---

#### 🔧 Chainmail Armor Pieces
Use **Chainlinks** in the standard vanilla armor shapes.

<details>
<summary>Show patterns</summary>

##### Helmet
```

[CL] [CL] [CL]
[CL] [  ] [CL]
[  ] [  ] [  ]

```

##### Chestplate
```

[CL] [  ] [CL]
[CL] [CL] [CL]
[CL] [CL] [CL]

```

##### Leggings
```

[CL] [CL] [CL]
[CL] [  ] [CL]
[CL] [  ] [CL]

```

##### Boots
```

[  ] [  ] [  ]
[CL] [  ] [CL]
[CL] [  ] [CL]

```
* **CL** = Chainlinks
</details>

---

## 🧩 Modpack-Friendly by Design
* **No-Enchant Packs:** This mod was primarily made for modpacks that disable enchanting and assign intrinsic enchants per tier.

* **Designed for Weight Systems** – Studded armor intentionally finishes the **Light Armor** branch (Leather → Chainmail → Studded) so it can keep pace with the **Heavy Armor** branch (Golden/Copper → Iron → Diamond).
  In setups like my upcoming [CAVEGAME.EXE](https://discord.gg/NhWG6YdSq7) modpack:
   * Studded = final **Light** tier
   * Diamond = final **Heavy** tier
   * Netherite = sole **Medium** end-game tier

* **Old-Beta Animal Logic** – gives leather an end-game use and value when breeding is disabled.

> ⚠️ *In a straight-vanilla playthrough—without intrinsic-enchant perks or an armor-weight system—the extra Studded tier may feel like “bloat”; yet it remains a nostalgic gem for legacy-feature aficionados.*

> 🎨 *Every texture—vintage Indev originals and brand-new additions alike—is drawn in the Programmer Art style, so it shines when paired with the vanilla “Programmer Art” pack and retro packs like [Golden Days](https://modrinth.com/resourcepack/golden-days) and [PACP](https://modrinth.com/resourcepack/pacp).*

---

## ⚙️ Technical
* **Minecraft:** 1.20.1
* **Loader:** Forge 47.4.0 or newer
* **Mod ID:** `studdedarmor`

---

## 🖇️ Credits
* **Original Textures:** *The Legend of the Chambered 2* & Indev 0.31
* **Additional Art:** *damikdevv*
* **Research:** Minecraft Wiki contributors
* **Code & Balance:** *HandLock_*

> *“Revive the lost armor of legend, and let your adventurers sparkle.”*