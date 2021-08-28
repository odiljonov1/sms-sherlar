package com.example.sms_sherlar.Models

data class Sher(val name:String, val matni:String)

object SherListObject{
    lateinit var sevgiList:ArrayList<Sher>
    lateinit var soginchList:ArrayList<Sher>
    lateinit var tabrikList:ArrayList<Sher>
    lateinit var otaOnaList:ArrayList<Sher>
    lateinit var dostlikList:ArrayList<Sher>
    lateinit var hazilList:ArrayList<Sher>
    lateinit var yangilarList:ArrayList<Sher>
    lateinit var saqlanganList:ArrayList<Sher>
}

fun loadData(){
    SherListObject.sevgiList = ArrayList()
    for (i in 0..3) {
        SherListObject.sevgiList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!"
            )
        )
    }

    SherListObject.soginchList = ArrayList()
    for (i in 0..3)
        SherListObject.soginchList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))


    SherListObject.tabrikList = ArrayList()
    for (i in 0..3)
        SherListObject.tabrikList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherListObject.otaOnaList = ArrayList()
    for (i in 0..3)
        SherListObject.otaOnaList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherListObject.dostlikList = ArrayList()
    for (i in 0..3)
        SherListObject.dostlikList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherListObject.hazilList = ArrayList()
    for (i in 0..3)
        SherListObject.hazilList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherListObject.yangilarList = ArrayList()
    for (i in 0..3)
        SherListObject.yangilarList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherListObject.saqlanganList = ArrayList()
    for (i in 0..3)
        SherListObject.saqlanganList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
}