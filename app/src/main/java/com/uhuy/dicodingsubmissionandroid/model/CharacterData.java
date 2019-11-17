package com.uhuy.dicodingsubmissionandroid.model;

import com.uhuy.dicodingsubmissionandroid.model.Character;
import java.util.ArrayList;

public class CharacterData {
    private static String[][] data = new String[][]{
            {"Billy Hargrove","Billy Hargrove is a main character and a secondary antagonist in the second season. He was one of the main antagonists of the third season but he redeemed himself by sacrificing his life to protect Eleven.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/6/60/S3Billy.jpg/revision/latest?cb=20190720004254"},
            {"Eleven", "Jane \"El\" Hopper (born Jane Ives), better known as Eleven, is one of the main protagonists of Stranger Things. Her character is portrayed by Millie Bobby Brown.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/f/f1/Eleven_S03_portrait.png/revision/latest/top-crop/width/200/height/150?cb=20190722075442"},
            {"Jim Hopper", "James \"Jim\" Hopper, portrayed by David Harbour, is a major character in the first, second, and third seasons of Stranger Things.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/c/c6/ST3_Jim_Hopper_portrait.jpg/revision/latest/scale-to-width-down/310?cb=20190703002805"},
            {"Will Byers", "William \"Will\" Byers, portrayed by Noah Schnapp, is a recurring character in the first season and a main character in the second and third season of Stranger Things.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/9/96/Will_S3.png/revision/latest/top-crop/width/200/height/150?cb=20190704211311"},
            {"Steve Harrington", "Steve Harrington, portrayed by Joe Keery, is a recurring character in the first season and a main character in the second and third season of Stranger Things.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/8/8b/ST3_Steve_Harrington_portrait.jpg/revision/latest/top-crop/width/200/height/150?cb=20190321055351"},
            {"Nancy Wheeler", "Nancy Wheeler, portrayed by starring cast member Natalia Dyer, is a major character in the first, second, and third seasons of Stranger Things. At first, concerned with simple teenage high school issues, her world is turned upside down when her best friend Barbara Holland vanishes, encouraging her to seek out the truth.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/2/22/Nancy_S3.png/revision/latest/top-crop/width/200/height/150?cb=20190704211903"},
            {"Joyce Byers", "Joyce Byers, portrayed by Winona Ryder, is a major character in Stranger Things. The financially poor single mother of Will and Jonathan Byers, Joyce workes as a retail clerk and relies on help from her eldest to make ends meet.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/d/df/Joyce_%28S3%29.png/revision/latest/scale-to-width-down/310?cb=20190705190931"},
            {"Dustin Henderson", "Dustin Henderson, portrayed by Gaten Matarazzo, is a major protagonist in the first three seasons of Stranger Things. He is best friends with Mike Wheeler, Lucas Sinclair , Eleven, Will Byers, and Max Mayfield.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/7/7b/Dustin_S3.png/revision/latest?cb=20190708052048"},
            {"Mike Wheeler", "Michael \"Mike\" Wheeler, portrayed by Finn Wolfhard, is one of the main protagonists of Stranger Things.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/f/f0/Mike_Wheeler_S3.png/revision/latest/scale-to-width-down/310?cb=20190708051731"},
            {"Max Mayfield", "Maxine \"Max\" Mayfield is a main protagonist introduced in the second season of Stranger Things. She is portrayed by Sadie Sink.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/4/41/6496D145-7DEC-4C23-BB62-0059C0A1A72E.jpeg/revision/latest/scale-to-width-down/310?cb=20190709215216"},
            {"Jonathan Byers", "Jonathan Byers, portrayed by starring cast member Charlie Heaton, is a major character in Stranger Things. He is the older brother of Will Byers. His life was turned upside down following the disappearance of his younger brother.", "https://vignette.wikia.nocookie.net/strangerthings8338/images/8/8e/Jonathan_S3.png/revision/latest?cb=20190709171439"}
    };
    public static ArrayList<Character> getListData(){
        ArrayList<Character> list = new ArrayList<>();
        for (String[] aData : data) {
            Character hero = new Character();
            hero.setName(aData[0]);
            hero.setDescription(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}
