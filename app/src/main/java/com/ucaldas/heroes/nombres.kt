package com.ucaldas.heroes

data class Elemento(
    val id: Int,
    val nombre: String,
    val imagenUrl: String,
    val descripcion: String,
    val superPoderes: List<String>
)

fun obtenerSuperheroes(): List<Elemento> = listOf(
    Elemento(
        1,
        "Superman",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/644-superman.jpg",
        "Superman es un heroe de Superman Prime One-Million reconocido por ACTION COMICS #1.",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        2,
        "Batman",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/70-batman.jpg",
        "Batman es un heroe de DC Comics reconocido por Detective Comics #27.",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        3,
        "Wonder Woman",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/720-wonder-woman.jpg",
        "Wonder Woman es un heroe de DC Comics reconocido por All-Star Comics #8 (December, 1941).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        4,
        "Spider-Man",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/620-spider-man.jpg",
        "Spider-Man es un heroe de Marvel Comics reconocido por Amazing Fantasy #15.",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        5,
        "Iron Man",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/346-iron-man.jpg",
        "Iron Man es un heroe de Marvel Comics reconocido por Tales to Suspense #39 (March, 1963).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        6,
        "Captain Marvel",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/157-captain-marvel.jpg",
        "Captain Marvel es un heroe de Binary reconocido por Ms. Marvel #1.",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        7,
        "Captain America",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/149-captain-america.jpg",
        "Captain America es un heroe de Marvel Comics reconocido por Captain America Comics #1 (March, 1941).",
        listOf("Combate experto")
    ),
    Elemento(
        8,
        "Thor",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/659-thor.jpg",
        "Thor es un heroe de Rune King Thor reconocido por Journey into Mystery #83 (August, 1962).",
        listOf("Super fuerza", "Super velocidad", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        9,
        "Hulk",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/332-hulk.jpg",
        "Hulk es un heroe de Marvel Comics reconocido por Incredible Hulk #1 (May, 1962).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        10,
        "Black Widow",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/107-black-widow.jpg",
        "Black Widow es un heroe de Marvel Comics reconocido por Tales of Suspense #52.",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        11,
        "Flash",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/263-flash.jpg",
        "Flash es un heroe de DC Comics reconocido por Flash Comics #1 (January, 1940).",
        listOf("Super velocidad")
    ),
    Elemento(
        12,
        "Hal Jordan",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/306-hal-jordan.jpg",
        "Hal Jordan es un heroe de DC Comics reconocido por Showcase #22.",
        listOf("Super fuerza", "Super velocidad", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        13,
        "Aquaman",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/38-aquaman.jpg",
        "Aquaman es un heroe de DC Comics reconocido por More Fun Comics #73 (November, 1941).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        14,
        "Cyborg",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/194-cyborg.jpg",
        "Cyborg es un heroe de DC Comics reconocido por DC Comics Presents #26 (October, 1980).",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        15,
        "Martian Manhunter",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/432-martian-manhunter.jpg",
        "Martian Manhunter es un heroe de DC Comics reconocido por Detective Comics #225 (1955).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        16,
        "Green Arrow",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/298-green-arrow.jpg",
        "Green Arrow es un heroe de DC Comics reconocido por More Fun Comics #73 (November 1941).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        17,
        "Black Panther",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/106-black-panther.jpg",
        "Black Panther es un heroe de Marvel Comics reconocido por Fantastic Four Vol. 1 #52 (1966).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        18,
        "Doctor Strange",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/226-doctor-strange.jpg",
        "Doctor Strange es un heroe de Marvel Comics reconocido por Strange Tales #110 (July, 1963).",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        19,
        "Scarlet Witch",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/579-scarlet-witch.jpg",
        "Scarlet Witch es un heroe de Marvel Comics reconocido por Uncanny X-Men #4 (March, 1964).",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        20,
        "Vision",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/697-vision.jpg",
        "Vision es un heroe de Anti-Vision reconocido por Avengers Vol.1 #57, Young Avengers # 4.",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        21,
        "Wolverine",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/717-wolverine.jpg",
        "Wolverine es un heroe de Marvel Comics reconocido por Incredible Hulk Vol. 2 #180.",
        listOf("Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        22,
        "Storm",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/638-storm.jpg",
        "Storm es un heroe de Marvel Comics reconocido por Giant-Size X-Men #1 (May, 1975).",
        listOf("Inteligencia superior", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        23,
        "Rogue",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/567-rogue.jpg",
        "Rogue es un heroe de Marvel Comics reconocido por Avengers Annual #10 (1981).",
        listOf("Inteligencia superior", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        24,
        "Beast",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/75-beast.jpg",
        "Beast es un heroe de Marvel Comics reconocido por X-MEN Vol. 1 #1, (in furry ape form) AMAZING ADVENTURES #11, (in current feline form) NEW X-MEN Vol. 1 #114.",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        25,
        "Nightcrawler",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/490-nightcrawler.jpg",
        "Nightcrawler es un heroe de Marvel Comics reconocido por GIANT-SIZE X-MEN #1.",
        listOf("Energia o poder especial", "Combate experto")
    ),
    Elemento(
        26,
        "Deadpool",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/213-deadpool.jpg",
        "Deadpool es un heroe de Evil Deadpool reconocido por New Mutants #98 (February, 1991).",
        listOf("Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        27,
        "Daredevil",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/201-daredevil.jpg",
        "Daredevil es un heroe de Marvel Comics reconocido por Daredevil #1 (April, 1964).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        28,
        "Punisher",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/530-punisher.jpg",
        "Punisher es un heroe de Marvel Comics reconocido por AMAZING SPIDER-MAN #129.",
        listOf("Combate experto")
    ),
    Elemento(
        29,
        "Silver Surfer",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/598-silver-surfer.jpg",
        "Silver Surfer es un heroe de Marvel Comics reconocido por Fantastic Four, Vol. 1 #48.",
        listOf("Super fuerza", "Super velocidad", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        30,
        "Captain Atom",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/150-captain-atom.jpg",
        "Captain Atom es un heroe de DC Comics reconocido por Captain Atom #1.",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        31,
        "Supergirl",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/643-supergirl.jpg",
        "Supergirl es un heroe de DC Comics reconocido por Superman/Batman #8 (May, 2004).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        32,
        "Batgirl",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/63-batgirl.jpg",
        "Batgirl es un heroe de Oracle reconocido por Detective Comics #359.",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        33,
        "Robin",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/561-robin.jpg",
        "Robin es un heroe de Batman II reconocido por Detective Comics #38 (April, 1940).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        34,
        "Starfire",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/632-starfire.jpg",
        "Starfire es un heroe de DC Comics reconocido por DC Comics Presents #26 (October, 1980).",
        listOf("Super fuerza", "Alta resistencia", "Combate experto")
    ),
    Elemento(
        35,
        "Raven",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/542-raven.jpg",
        "Raven es un heroe de DC Comics reconocido por DC Comics Presents #26 (October, 1980).",
        listOf("Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        36,
        "Beast Boy",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/76-beast-boy.jpg",
        "Beast Boy es un heroe de DC Comics reconocido por Doom Patrol #99 (November, 1965).",
        listOf("Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        37,
        "Hawkgirl",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/315-hawkgirl.jpg",
        "Hawkgirl es un heroe de DC Comics reconocido por JSA Secret Files #1 (August, 1999).",
        listOf("Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        38,
        "Zatanna",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/730-zatanna.jpg",
        "Zatanna es un heroe de DC Comics reconocido por Hawkman #4.",
        listOf("Inteligencia superior", "Energia o poder especial")
    ),
    Elemento(
        39,
        "Ant-Man",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/30-ant-man.jpg",
        "Ant-Man es un heroe de Giant-Man reconocido por Tales to Astonish #27 (January, 1962) (as Hank Pym)  Tales to Astonish #35 (September, 1962) (as Ant-Man).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        40,
        "Wasp",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/708-wasp.jpg",
        "Wasp es un heroe de Marvel Comics reconocido por TALES TO ASTONISH #44.",
        listOf("Habilidades especiales")
    ),
    Elemento(
        41,
        "Falcon",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/251-falcon.jpg",
        "Falcon es un heroe de Marvel Comics reconocido por Captain America #117 (September, 1969).",
        listOf("Habilidades especiales")
    ),
    Elemento(
        42,
        "Winter Soldier",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/714-winter-soldier.jpg",
        "Winter Soldier es un heroe de Marvel Comics reconocido por Captain America Vol 5 #1 (January, 2005) (as Winter Soldier).",
        listOf("Combate experto")
    ),
    Elemento(
        43,
        "Moon Knight",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/470-moon-knight.jpg",
        "Moon Knight es un heroe de Marvel Comics reconocido por Werewolf by Night #32 (August, 1975).",
        listOf("Combate experto")
    ),
    Elemento(
        44,
        "She-Hulk",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/589-she-hulk.jpg",
        "She-Hulk es un heroe de Marvel Comics reconocido por She-Hulk (Vol. 1) #1.",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Combate experto")
    ),
    Elemento(
        45,
        "Gamora",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/275-gamora.jpg",
        "Gamora es un heroe de Marvel Comics reconocido por Strange Tales #180 (June, 1975).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Combate experto")
    ),
    Elemento(
        46,
        "Rocket Raccoon",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/566-rocket-raccoon.jpg",
        "Rocket Raccoon es un heroe de Marvel Comics reconocido por Marvel Preview #7 (June, 1976).",
        listOf("Habilidades especiales")
    ),
    Elemento(
        47,
        "Groot",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/303-groot.jpg",
        "Groot es un heroe de Marvel Comics reconocido por Tales to Astonish #13 (November, 1960).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        48,
        "Drax the Destroyer",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/234-drax-the-destroyer.jpg",
        "Drax the Destroyer es un heroe de Marvel Comics reconocido por Iron Man #55 (February, 1973).",
        listOf("Super fuerza", "Alta resistencia")
    ),
    Elemento(
        49,
        "Mantis",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/431-mantis.jpg",
        "Mantis es un heroe de Marvel Comics reconocido por Avengers #112.",
        listOf("Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        50,
        "Nova",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/497-nova.jpg",
        "Nova es un heroe de Marvel Comics reconocido por Fantastic Four #164 (November, 1975).",
        listOf("Super velocidad", "Alta resistencia", "Energia o poder especial")
    )
)

fun obtenerVillanos(): List<Elemento> = listOf(
    Elemento(
        51,
        "Joker",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/370-joker.jpg",
        "Joker es un villano de DC Comics reconocido por Batman #1 (Spring 1940).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        52,
        "Lex Luthor",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/405-lex-luthor.jpg",
        "Lex Luthor es un villano de DC Comics reconocido por Action Comics #23.",
        listOf("Inteligencia superior")
    ),
    Elemento(
        53,
        "Darkseid",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/204-darkseid.jpg",
        "Darkseid es un villano de DC Comics reconocido por Superman's Pal Jimmy Olsen #134 (November, 1970).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        54,
        "Bane",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/60-bane.jpg",
        "Bane es un villano de DC Comics reconocido por Batman: Vengeance of Bane #1 (January, 1993).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        55,
        "Harley Quinn",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/309-harley-quinn.jpg",
        "Harley Quinn es un villano de DC Comics reconocido por Batman: Harley Quinn (October, 1999).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        56,
        "Poison Ivy",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/522-poison-ivy.jpg",
        "Poison Ivy es un villano de DC Comics reconocido por Batman #181 (June, 1966).",
        listOf("Inteligencia superior", "Energia o poder especial")
    ),
    Elemento(
        57,
        "Two-Face",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/678-two-face.jpg",
        "Two-Face es un villano de DC Comics reconocido por -.",
        listOf("Inteligencia superior")
    ),
    Elemento(
        58,
        "Scarecrow",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/576-scarecrow.jpg",
        "Scarecrow es un villano de DC Comics reconocido por WORLD'S FINEST COMICS #3 (Fall, 1941).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        59,
        "Riddler",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/558-riddler.jpg",
        "Riddler es un villano de DC Comics reconocido por Detective Comics #140 (1948).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        60,
        "Penguin",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/514-penguin.jpg",
        "Penguin es un villano de DC Comics reconocido por DETECTIVE COMICS #58 (December, 1941).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        61,
        "Ra's Al Ghul",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/538-ras-al-ghul.jpg",
        "Ra's Al Ghul es un villano de DC Comics reconocido por Batman #232 (June, 1971).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        62,
        "Deathstroke",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/216-deathstroke.jpg",
        "Deathstroke es un villano de DC Comics reconocido por New Teen Titans #2 (December, 1980).",
        listOf("Inteligencia superior", "Alta resistencia", "Combate experto")
    ),
    Elemento(
        63,
        "Sinestro",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/601-sinestro.jpg",
        "Sinestro es un villano de DC Comics reconocido por Green Lantern Vol 2 #7.",
        listOf("Inteligencia superior", "Super fuerza", "Energia o poder especial")
    ),
    Elemento(
        64,
        "Brainiac",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/136-brainiac.jpg",
        "Brainiac es un villano de DC Comics reconocido por Action Comics #242 (July, 1958).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Combate experto")
    ),
    Elemento(
        65,
        "Doomsday",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/230-doomsday.jpg",
        "Doomsday es un villano de DC Comics reconocido por Superman: The Man of Steel #17 (Nov 1992).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        66,
        "Black Adam",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/95-black-adam.jpg",
        "Black Adam es un villano de DC Comics reconocido por Marvel Family #1 (December, 1945).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    ),
    Elemento(
        67,
        "Cheetah",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/172-cheetah.jpg",
        "Cheetah es un villano de DC Comics reconocido por Wonder Woman Vol1 #6 (Fall 1943).",
        listOf("Habilidades especiales")
    ),
    Elemento(
        68,
        "Thanos",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/655-thanos.jpg",
        "Thanos es un villano de Marvel Comics reconocido por Iron Man #55.",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        69,
        "Loki",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/414-loki.jpg",
        "Loki es un villano de Marvel Comics reconocido por Journey into Mystery Vol. 1 #85.",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        70,
        "Ultron",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/680-ultron.jpg",
        "Ultron es un villano de Marvel Comics reconocido por Avengers #54 (July, 1968).",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        71,
        "Magneto",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/423-magneto.jpg",
        "Magneto es un villano de Marvel Comics reconocido por X-MEN Vol. 1 #1.",
        listOf("Inteligencia superior", "Super fuerza", "Alta resistencia", "Energia o poder especial")
    ),
    Elemento(
        72,
        "Doctor Doom",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/222-doctor-doom.jpg",
        "Doctor Doom es un villano de Marvel Comics reconocido por Fantastic Four #5 (July, 1962).",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        73,
        "Green Goblin",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/299-green-goblin.jpg",
        "Green Goblin es un villano de Marvel Comics reconocido por Amazing Spider-Man #14 (July, 1964).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        74,
        "Venom",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/687-venom.jpg",
        "Venom es un villano de Anti-Venom reconocido por (as alien costume) Secret Wars #8, (behind the scenes) Web of Spider-Man #18, (actual appearance) Amazing Spider-Man #300.",
        listOf("Inteligencia superior", "Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        75,
        "Red Skull",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/550-red-skull.jpg",
        "Red Skull es un villano de Marvel Comics reconocido por Captain America Comics #1 (1941), (modern) Tales of Suspense #66 (1965).",
        listOf("Inteligencia superior", "Combate experto")
    ),
    Elemento(
        76,
        "Kingpin",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/391-kingpin.jpg",
        "Kingpin es un villano de Marvel Comics reconocido por Amazing Spider-Man #50 (July, 1967).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        77,
        "Doctor Octopus",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/225-doctor-octopus.jpg",
        "Doctor Octopus es un villano de Marvel Comics reconocido por Amazing Spider-Man #3 (July, 1963).",
        listOf("Inteligencia superior")
    ),
    Elemento(
        78,
        "Mystique",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/480-mystique.jpg",
        "Mystique es un villano de Marvel Comics reconocido por (as Raven Darkholme) MS. MARVEL #16, (as Mystique) MS. MARVEL #18.",
        listOf("Inteligencia superior")
    ),
    Elemento(
        79,
        "Carnage",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/162-carnage.jpg",
        "Carnage es un villano de Marvel Comics reconocido por Amazing Spider-Man #344 (February, 1991).",
        listOf("Alta resistencia", "Energia o poder especial", "Combate experto")
    ),
    Elemento(
        80,
        "Dormammu",
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/232-dormammu.jpg",
        "Dormammu es un villano de Marvel Comics reconocido por Strange Tales #126 (1964).",
        listOf("Inteligencia superior", "Super fuerza", "Super velocidad", "Alta resistencia")
    )
)
