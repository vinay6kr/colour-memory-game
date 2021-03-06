package com.vinay.colourmemory.utils

import com.vinay.colourmemory.R
import com.vinay.colourmemory.vo.Card

/**
 * Created by VINAY'S on 31/10/21.
 */
val createCardsData : List<Card> = listOf(
    Card(1, false, R.drawable.colour1, R.drawable.card_bg, false),
    Card(2, false, R.drawable.colour1, R.drawable.card_bg, false),
    Card(3, false, R.drawable.colour2, R.drawable.card_bg, false),
    Card(4, false, R.drawable.colour2, R.drawable.card_bg, false),
    Card(5, false, R.drawable.colour3, R.drawable.card_bg, false),
    Card(6, false, R.drawable.colour3, R.drawable.card_bg, false),
    Card(7, false, R.drawable.colour4, R.drawable.card_bg, false),
    Card(8, false, R.drawable.colour4, R.drawable.card_bg, false),
    Card(9, false, R.drawable.colour5, R.drawable.card_bg, false),
    Card(10, false, R.drawable.colour5, R.drawable.card_bg, false),
    Card(11, false, R.drawable.colour6, R.drawable.card_bg, false),
    Card(12, false, R.drawable.colour6, R.drawable.card_bg, false),
    Card(13, false, R.drawable.colour7, R.drawable.card_bg, false),
    Card(14, false, R.drawable.colour7, R.drawable.card_bg, false),
    Card(15, false, R.drawable.colour8, R.drawable.card_bg, false),
    Card(16, false, R.drawable.colour8, R.drawable.card_bg, false)
).shuffled()