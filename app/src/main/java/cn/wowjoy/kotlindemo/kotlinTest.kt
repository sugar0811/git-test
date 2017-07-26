        package cn.wowjoy.kotlindemo

        /**
         * Created by liu on 2017/7/11.
         *
         */
    //    fun main(args: Array<String>){
        //    val sumLambda : (Int ,Int) -> Int = {x,y -> x+y}
        //    println(sumLambda(3,4))
        //    val c : Int
        //    c = 1
        //    val a : Int = 1
        //    val b = 1
        //
        //    var d = 1
        //    d+=1
        //    var age: String? = "22"
            //抛出空指针异常
        //    val ages = age!!.toInt()
        //    val ages = age?.toInt()
        //    print(ages)

        //    for(i in 10  downTo  1 step 2) print(i)

        //    val b = Array(3,{i -> (i * 2)})
        //    loop@ for ((index,value) in b.withIndex()) {println("the element at $index is $value")}

        //    for(item : Int in b) print(item)
        //    print(b)

        //    val s = """
        //               nianianai
        //               sadadasdasd
        //               asdasdasdad""".trimMargin()
        //    print(s)
        //    val a = 1
        //    val r = 2
        //    val max1 = if(a > r){
        //        print("choose a")
        //        a
        //    }else {
        //        println("choose r")
        //        r
        //    }
        //    println(max1)

        //    val max = if(a>r)a else r
        //    print(max)

        //    hasSugar("aaa")

    //            val ints = listOf<Int>(11,0,33)
    //            foo(ints)
    //
    //
    //
    //
    //
    //    }


        fun test(){
            val items = listOf<String>("aa","bb","cc")
            for (item in items)
                print(item)
        }

        fun foo(ints : List<Int>){

            ints.forEach (fun (value : Int){

                if(value == 0)return
                println(value)

            })

            println("here wo go")

        }


            fun check(a : Char){

                if(a == '0'){


                }


            }
            fun hasSugar(x : Any){
    //            var clazz = testClass();
        //        when(x){
        //
        //             is String -> print("ss")
        //             else -> false
        //        }
        //        print(x)
        //
        //        when(x){
        //            in 1..10 -> print("ss")
        //            else -> println("ssss")
        //        }
        //
                val items = setOf("aaa","bbb","ccc")
                when(x){

                     in items -> print("items contains x")

                }

            }

        class testClass private constructor(d : Int,f:Int){
            var a : Int = 2
            var b = 2
            var f = d

        }

        class Person private constructor(){

            var lastName : String ="zhang"
            get() = field.toUpperCase()
            set
            var no : Int = 100
            get() = field
            set(value){

                if(value < 10){
                    field = value
                } else {
                    field = -1
                }
            }

            init {
                println("初始化中")
            }

            constructor(name:String,age:Int) : this(){

            }


        }

    //    fun main(args: Array<String>) {
    ////        var person = Person("1",2)
    ////        println("persion.lastName=${person.lastName}")
    ////        person.lastName = "li"
    ////        println("persion.lastName=${person.lastName}")
    ////        println("no:${person.no}")
    ////        person.no = 9
    ////        println("no:${person.no}")
    ////        person.no = 20
    ////        println("no:${person.no}")
    //          var play = Father().Son().play()
    //            println(play)
    //            var go =Father().Son().go()
    //
    //    }
    //    class Father {
    //
    //        var name ="shu"
    //        var age = 24
    //        inner class Son {
    //
    //            fun play() = name
    //            fun go(){
    //                var fath = this@Father
    //                println(fath.age)
    //            }
    //
    //        }
    //
    //
    //    }
    open class Base{

        var baseInt = 2
        var baseStr = "222"

        constructor(baseInt : Int ,baseStr : String){
            this.baseInt = baseInt
            this.baseStr = baseStr
        }


    }

    class Some : Base{

        constructor(age: Int ,name: String) : super(age,name){


        }

    }

        fun main(args : Array<String>){

            var bigWhite = Some(24,"大白")
            println("bigWhite age = ${bigWhite.baseInt}")
            println("bigWhite name = ${bigWhite.baseStr}")


        }

