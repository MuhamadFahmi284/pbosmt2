//import java.*;
import java.io.*;
/*class induk dengan nama Bentukwajah*/
class BentukWajah
{
    //membuat sebuah method respons pada class induk dimana mengembalikan
    public String respons()
    {return("perhatikan reaksi wajah saya\n");}
}
/*membuat class-class lain dengan turunan dari  class Bentukwajah*/
class Senyum extends BentukWajah
{
    public String respons()
    {return("Senyum karena senang\n");}
}
class Tertawa extends BentukWajah
{
    public String respons()
    {return("Tertawa karena senang\n");}
}
class Marah extends BentukWajah
{
    public String respons()
    {return("Kemarahan disebabkan bertangkar\n");}
}
class Sedih extends BentukWajah
{
    public String respons()
    {return("Sedih disebabkan cemburu\n");}
}
