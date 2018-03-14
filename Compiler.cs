using System;

namespace Compiler
{
    public class Compiler
    {
        static int Main(string[] args)
        {
            if (args.Length == 0)
            {
                System.Console.WriteLine("No file to compile.");
                return 1;
            }
            else if (args.Length == 1)
            {
                if (args[0].EndsWith(".e"))
                {
                    // Compile the file
                    
                    string text = System.IO.File.ReadAllText(System.IO.Path.Combine(System.IO.Directory.GetCurrentDirectory(), args[0]));
                    
                    string[] split = text.Split(null);
                    foreach(string str in split)
                    {
                        int len = str.Length;
                        char character = (char)len;
                        System.Console.Write(character);
                    }
                    return 1;
                }
                else
                {
                    System.Console.WriteLine("Invalid input file.");
                    return 1;
                }
            }
            else
            {
                System.Console.WriteLine("Invalid input file.");
                return 1;
            }
        }
    }
}
