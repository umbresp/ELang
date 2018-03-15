if ARGV[0]
  if ARGV[0].end_with? ".e"
    # stuff
    begin
      stuff = File.read(ARGV[0])
      arr = stuff.split(" ")
      output = ""
      for i in arr
        len = i.length
        thing = len.chr
        output += thing
      end
      puts output
    rescue Exception => e
      puts e.message
    end
  else
    puts "Invalid source file."
  end
else
  puts "No file specified."
end
