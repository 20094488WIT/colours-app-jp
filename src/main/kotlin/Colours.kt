class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return colours
    }

    fun numberOfColours (): Int{
        return colours.size
    }

    fun firstColour() : String{
        return colours.first()
    }

    fun lastColour() : String{
       return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        // Answer found at https://stackoverflow.com/questions/53351465/sort-array-by-alphabet-using-kotlin
        val sortedColours = colours.sortedBy { it.toString() }
        return sortedColours
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        val uppercaseColours = colours.map { it.uppercase() }
        return uppercaseColours
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return return colours.filter {it.contains(letter)}
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter {it.length == size}
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than ${size} chars")
        return colours.filter {it.length <= size}
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return colours.contains(colour)
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}