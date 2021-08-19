package com.example.myanime;

import java.util.ArrayList;

public class DataDummy {
    static String[] titles = {
            "Re:Zero kara Hajimeru Isekai Seikatsu 2nd Season",
            "The God of High School",
            "Yahari Ore no Seishun Love Comedy wa Machigatteiru. Kan",
            "Kanojo, Okarishimasu",
            "Maou Gakuin no Futekigousha",
            "Sword Art Online: Alicization - War of Underworld 2nd Season",
            "Enen no Shouboutai: Ni no Shou",
            "Uzaki-chan wa Asobitai!",
            "Deca-Dence",
            "Monster Musume no Oishasan"
    };

    static String[] tags = {
            "Drama, Fantasy, Psychological, Thriller",
            "Action, Sci-Fi, Adventure, Comedy, Supernatural, Martial Arts, Fantasy",
            "Slice of Life, Comedy, Drama, Romance, School",
            "Comedy, Romance, School, Shounen",
            "Action, Demons, Magic, Fantasy, School",
            "Action, Game, Adventure, Romance, Fantasy",
            "Action, Supernatural, Shounen",
            "Slice of Life, Comedy, Romance, Ecchi",
            "Action, Sci-Fi, Adventure",
            "Comedy, Romance, Ecchi, Fantasy"
    };

    static String[] images = {
            "https://cdn.myanimelist.net/images/anime/1444/108005.webp",
            "https://cdn.myanimelist.net/images/anime/1722/107269.webp",
            "https://cdn.myanimelist.net/images/anime/1958/107912.webp",
            "https://cdn.myanimelist.net/images/anime/1485/107693.webp",
            "https://cdn.myanimelist.net/images/anime/1126/108573.webp",
            "https://cdn.myanimelist.net/images/anime/1438/105106.webp",
            "https://cdn.myanimelist.net/images/anime/1673/107657.webp",
            "https://cdn.myanimelist.net/images/anime/1540/108292.webp",
            "https://cdn.myanimelist.net/images/anime/1627/107552.webp",
            "https://cdn.myanimelist.net/images/anime/1762/106598.webp"
    };

    static String[] details = {
            "Even after dying countless times, Subaru finally ended the threat of the White Whale and defeated the Witch Cult's Sin Archbishop representing sloth, Petelgeuse Romaneeconti. \n " +
                    "\n" +
                    "But only shortly after overcoming a tragic ending and reuniting with his beloved Emilia, Subaru learns that Rem has been erased from this world, having fallen victim to the White Whale's Fog of Elimination in the midst of Subaru's death loop. With the White Whale now gone, Subaru and Emilia are forced to confront a reality they never dreamed would happen.",
            "The \"God of High School\" tournament has begun, seeking out the greatest fighter among Korean high school students! All martial arts styles, weapons, means, and methods of attaining victory are permitted. The prize? One wish for anything desired by the winner.\n" +
                    "\n" +
                    "Taekwondo expert Jin Mo-Ri is invited to participate in the competition. There he befriends karate specialist Han Dae-Wi and swordswoman Yu Mi-Ra, who both have entered for their own personal reasons.",
            "Resolved to become a more independent person, Yukino Yukinoshita decides to smoothen things out with her parents, and the first step toward achieving that goal is to prove herself.\n" +
                    "\n" +
                    "As graduation draws closer for the third-year students, Iroha Isshiki—the president of the student council—requests a graduation prom in collaboration with the Volunteer Service Club.",
            "Kazuya Kinoshita is a 20-year-old college student who has a wonderful girlfriend: the bright and sunny Mami Nanami. But suddenly, he doesn't. Without warning, Mami breaks up with him, leaving him utterly heartbroken and lonely. Seeking to soothe the pain, he hires a rental girlfriend through an online app. His partner is Chizuru Mizuhara, who through her unparalleled beauty and cute demeanor, manages to gain Kazuya's affection.",
            "After 2000 years have passed, the ruthless demon lord has just been reincarnated! But his aptitude at an academy for nurturing candidates for demon lords is, “inept”!?\n" +
                    "\n" +
                    "Having the capability to destroy humans, elementals, and gods, after a long period of countless wars and strife, Arnos the demon lord became sick and tired of all that and longed for a peaceful world, so he decided to reincarnate to the future.",
            "The final battle against the Dark Territory drags on, as players from all over the world flood the Underworld's servers and plunge the Human Empire into utter chaos. Asuna Yuuki and her friends defend their new allies with everything they have, but their numbers are falling. Meanwhile, Alice Zuberg heads toward the World's End Altar while Gabriel \"Vecta\" Miller relentlessly pursues her.",
            "The second season of Enen no Shouboutai.\n" +
                    "\n" +
                    "Shinra and Company 8 have figured out the Evangelist’s goal: to gather Adolla Bursts from Shinra and Shou. After learning more about his past from Captain Burns, Shinra becomes more motivated to discover the truth about his mother and save Shou again.\n" +
                    "\n" +
                    "But a mysterious girl known as the \"First Pillar\" reveals the Evangelist’s master plan to start another Great Cataclysm!",
            "Sakurai Shinichi's one wish is for a little peace and quiet. But Uzaki Hana–his boisterous, well-endowed underclassman–has other plans. All she wants is to hang out and poke fun at him. With the help of her chipper charm and peppy persistence, this might just be the start of a beautiful relationship!",
            "Many years have passed since humanity was driven to the brink of extinction by the sudden emergence of the unknown life forms Gadoll. Those humans that survived now dwell in a 3000m-high mobile fortress Deca-dence built to protect themselves from the Gadoll threat.",
            "After years of conflict, humans and monsters have settled their differences and are now at peace. This post-war era led to the foundation of Lindworm—a town which has since become the focal point of racial harmony.\n" +
                    "\n" +
                    "As a human doctor specializing in monster biology, Glenn Litbeit runs a small clinic alongside his partner, Saphentite Neikes, who is a half-snake monster known as a lamia. He uses his knowledge to tend to any monsters who seek his aid. Whatever affliction, concern, or injury it may be, he will always be there, ready to help.\n"
    };


    public static ArrayList<Anime> getAllDataDummy(){
        ArrayList<Anime> list = new ArrayList<>();
        for (int i = 0; i<titles.length; i++) {
            Anime anime = new Anime(
                    titles[i],
                    tags[i],
                    images[i],
                    details[i]
            );
            list.add(anime);
        }
        return list;
    }
}
