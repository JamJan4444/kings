package de.jan;

import de.game.jan.kings.R;

/**
 * Created by JamJan4444 on 25.04.16.
 */
public enum Card {
    SEVENOFDIAMONDS(0, R.drawable.seven_diamond),
    EIGHTOFDIAMONDS(1,R.drawable.eight_diamond),
    NINEOFDIAMONDS(2,R.drawable.nine_diamond),
    TENOFDIAMONDS(3,R.drawable.ten_diamond),
    JACKOFDIAMONDS(4,R.drawable.jack_diamond),
    QUEENTOFDIAMONDS(5,R.drawable.queen_diamond),
    KINGOFDIAMONDS(6,R.drawable.king_diamond),
    ACEOFDIAMONDS(7,R.drawable.ace_diamond),

    SEVENOFHEARTS(8,R.drawable.seven_heart),
    EIGHTOFHEARTS(9,R.drawable.eight_heart),
    NINEOFHEARTS(10,R.drawable.nine_heart),
    TENOFHEARTS(11,R.drawable.ten_heart),
    JACKOFHEARTS(12,R.drawable.jack_heart),
    QUEENOFHEARTS(13,R.drawable.queen_heart),
    KINGOFHEARTS(14,R.drawable.king_heart),
    ACEOFHEARTS(15,R.drawable.ace_heart),

    SEVENOFSPADES(16,R.drawable.seven_spade),
    EIGHTOFSPADES(17,R.drawable.eight_spade),
    NINEOFSPADES(18,R.drawable.nine_spade),
    TENOFSPADES(19,R.drawable.ten_spade),
    JACKOFSPADES(20,R.drawable.jack_spade),
    QUEENTOFSPADES(21,R.drawable.queen_spade),
    KINGOFSPADES(22,R.drawable.king_spade),
    ACEOFSPADES(23,R.drawable.ace_spade),

    SEVENOFCLUBS(24,R.drawable.seven_club),
    EIGHTOFCLUBS(25,R.drawable.eight_club),
    NINEOFCLUBS(26,R.drawable.nine_club),
    TENOFCLUBS(27,R.drawable.ten_club),
    JACKOFCLUBS(28,R.drawable.jack_club),
    QUEENTOFCLUBS(29,R.drawable.queen_club),
    KINGOFCLUBS(30,R.drawable.king_club),
    ACEOFCLUBS(31,R.drawable.ace_club);

    private final int index;
    private final int ref;

    Card(int index, int ref){
        this.index = index;
        this.ref = ref;
    }

    private int index() { return index; }
    public int ref() { return ref; }
}
