package com.example.lemonade

object Steps {
    var values: HashMap<Int, StepDetails> = hashMapOf(
        1 to StepDetails(R.drawable.lemon_tree, R.string.tap_lemon_tree, R.string.lemon_tree),
        2 to StepDetails(R.drawable.lemon_squeeze, R.string.tap_lemon, R.string.lemon, (2..4).random()),
        3 to StepDetails(R.drawable.lemon_drink, R.string.tap_lemonade, R.string.glass),
        4 to StepDetails(R.drawable.lemon_restart, R.string.tap_empty_glass, R.string.empty_glass)
    )
    fun generateNewValues(){
        values = hashMapOf(
            1 to StepDetails(R.drawable.lemon_tree, R.string.tap_lemon_tree, R.string.lemon_tree),
            2 to StepDetails(R.drawable.lemon_squeeze, R.string.tap_lemon, R.string.lemon, (2..4).random()),
            3 to StepDetails(R.drawable.lemon_drink, R.string.tap_lemonade, R.string.glass),
            4 to StepDetails(R.drawable.lemon_restart, R.string.tap_empty_glass, R.string.empty_glass)
        )
    }
}
