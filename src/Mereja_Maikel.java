import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class Mereja_Maikel extends MIDlet implements CommandListener{

    List mainList;
    List list4hotelForm;
    List list4cinemaForm;
    List list4mediaForm;
    List list4policeForm;
    List list4hospitalForm;
    List list4fireForm;
    List list4airportForm;
    List list4transportForm;
    List list4libraryForm;
    List list4bankForm;
    List list4insuranceForm;
    Command okCommand4mainList;
    Command okCommand4hotelForm;
    Command okCommand4cinemaForm;
    Command okCommand4mediaForm;
    Command okCommand4policeForm;
    Command okCommand4hospitalForm;
    Command okCommand4fireForm;
    Command okCommand4airportForm;
    Command okCommand4transportForm;
    Command okCommand4libraryForm;
    Command okCommand4bankForm;
    Command okCommand4insuranceForm;
    Image greenIcon;
    Image yellowIcon;
    Image redIcon;
    Image blueIcon;
    Command exitCommand = new Command("ውጣ",Command.EXIT,1);
    Command back2StartApp = new Command("ተመለስ",Command.BACK,1);
    
    protected void callTo(String phoneNumber){
        try{
            platformRequest("tel:"+phoneNumber);
            System.out.println("Called To "+phoneNumber);
        }
        catch(Exception e){
            System.out.println("Call To Is The Problem");
        }
    }
    
    protected void mainList(){
        
        okCommand4mainList= new Command("እሺ",Command.OK, 0);
        mainList = new List("መረጃ ማዕከል", List.IMPLICIT);
        mainList.addCommand(okCommand4mainList);
        mainList.addCommand(exitCommand);
        mainList.append(" ሆስፒታል",greenIcon);
        mainList.append(" ፖሊስ",greenIcon);
        mainList.append(" እሳት አደጋ",greenIcon);
        mainList.append(" ኢንሹራንስ",yellowIcon);
        mainList.append(" ባንክ",yellowIcon);
        mainList.append(" ሆቴል",yellowIcon);
        mainList.append(" ሲኒማ",redIcon);
        mainList.append(" መገናኛ ብዙሃን",redIcon);
        mainList.append(" አየር መንገድ",redIcon);
        mainList.append(" መጓጓዣ",blueIcon);
        mainList.append(" ቤተ መፅሀፍት",blueIcon);
        mainList.append(" ስለ አፕሊኬሽኑ",blueIcon);
        mainList.setCommandListener(this);
        Display.getDisplay(this).setCurrent(mainList);
    }

    protected void  aboutMe(){
        
        Form aboutMe = new Form("#HenokG");
        String tk = new String("\"መረጃ ማዕከል\" ዴቨሎፕ የተደረገው በአደጋ ጊዜ, በመዝናኛ ጊዜ ወይም በማንኛውም ጊዜ ወደሚፈልጉት የአገልግሎት"
                + " መስጫ ተቋም እንዲደውሉ እና የአገልግሎቱ ተጠቃሚ እንዲሆኑ ነው. አፕሊኬሽኑ ላይ ምንም አይነት ችግር, የተሳሳተ መረጃ ወይም አፕሊኬሽኑን ከወደዱት"
                + " በሚቀጥለው አድራሻ ያሳውቁን hhenok1987@gmail.com or 0920751501. ይህን አፕሊኬሽን ስለ ተጠቀሙት እናመሰግናለን.\n"
                + " Developer: Henok G [A 2nd Year Software Engineering student at AAU(AAIT)]\nRelease Year: 2015");
        aboutMe.addCommand(back2StartApp);
        aboutMe.append(tk);
        aboutMe.setCommandListener(this);
        Display.getDisplay(this).setCurrent(aboutMe);
    }

    protected void hotelForm(){

        okCommand4hotelForm = new Command("ደውል", Command.OK, 0);
        list4hotelForm = new List("ሆቴል", List.IMPLICIT);
        list4hotelForm.addCommand(back2StartApp);
        list4hotelForm.addCommand(okCommand4hotelForm);
        list4hotelForm.append(" አምባሳደር ሆቴል",greenIcon);
        list4hotelForm.append(" አየር መንገድ ሆቴል",greenIcon);
        list4hotelForm.append(" አራራት ሆቴል",greenIcon);
        list4hotelForm.append(" አትላስ ኢንተርናሽናል ሆቴል",greenIcon);
        list4hotelForm.append(" አክሱም ሆቴል",greenIcon);
        list4hotelForm.append(" በሻሌ ሆቴል",greenIcon);
        list4hotelForm.append(" ሴንትራል ሸዋ ሆቴል",greenIcon);
        list4hotelForm.append(" ኮርኮድ ሆቴል",greenIcon);
        list4hotelForm.append(" ክራውን ሆቴል",greenIcon);
        list4hotelForm.append(" ዲያፍሪቅ ሆቴል",greenIcon);
        list4hotelForm.append(" ዲሚትሪ ሆቴል",greenIcon);
        list4hotelForm.append(" ደሳለኝ ሆቴል",greenIcon);
        list4hotelForm.append(" ዲ ሊኦፓል ሆቴል",greenIcon);
        list4hotelForm.append(" ድሪም ላይነር ሆቴል",greenIcon);
        list4hotelForm.append(" ኢትዮጵያ ሆቴል",greenIcon);
        list4hotelForm.append(" ኤክስትሪም ሆቴል",greenIcon);
        list4hotelForm.append(" ገነት ሆቴል",greenIcon);
        list4hotelForm.append(" ጊዮን ሆቴል",greenIcon);
        list4hotelForm.append(" ግሎባል ሆቴል",greenIcon);
        list4hotelForm.append(" ሃራምቤ ሆቴል",greenIcon);
        list4hotelForm.append(" ሃርመኒ ሆቴል",greenIcon);
        list4hotelForm.append(" ሂልተን ሆቴል",greenIcon);
        list4hotelForm.append(" ኢምፔርያል ሆቴል",greenIcon);
        list4hotelForm.append(" ኢንተርኮንቲኔንታል ሆቴል",greenIcon);
        list4hotelForm.append(" እየሩሳሌም ሆቴል",greenIcon);
        list4hotelForm.append(" ጁፒተር ሆቴል",greenIcon);
        list4hotelForm.append(" ኪንግስ ሆቴል",greenIcon);
        list4hotelForm.append(" ላሊበላ ሆቴል",greenIcon);
        list4hotelForm.append(" መሪድያን ሆቴል",greenIcon);
        list4hotelForm.append(" ናሽናል ሆቴል",greenIcon);
        list4hotelForm.append(" ፕላዛ ሆቴል",greenIcon);
        list4hotelForm.append(" ንግስት ሳባ ሆቴል",greenIcon);
        list4hotelForm.append(" ፓናሮማ ሆቴል",greenIcon);
        list4hotelForm.append(" ራስ አምባ ሆቴል",greenIcon);
        list4hotelForm.append(" ራስ ሆቴል",greenIcon);
        list4hotelForm.append(" ሪቨራ ሆቴል",greenIcon);
        list4hotelForm.append(" ሰሜን ሆቴል",greenIcon);
        list4hotelForm.append(" ሸራተን ሆቴል",greenIcon);
        list4hotelForm.append(" ዋቢ ሸበሌ ሆቴል",greenIcon);
        list4hotelForm.append(" ዮሊ ሆቴል",greenIcon);
        list4hotelForm.append(" ዮርዳኖስ ሆቴል",greenIcon);
        list4hotelForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4hotelForm);
    }
    
    protected void cinemaForm(){

        okCommand4cinemaForm = new Command("ደውል", Command.OK, 0);
        list4cinemaForm = new List("ሲኒማ", List.IMPLICIT);
        list4cinemaForm.addCommand(back2StartApp);
        list4cinemaForm.addCommand(okCommand4cinemaForm);
        list4cinemaForm.append(" አምባሳደር ሲኒማ",greenIcon);
        list4cinemaForm.append(" ሜጋ አንፊ ትያትር",greenIcon);
        list4cinemaForm.append(" ሲቲ ሆል ሲኒማ",greenIcon);
        list4cinemaForm.append(" ኤድና ሞል ማቲ ሲኒማ",greenIcon);
        list4cinemaForm.append(" ሃገር ፍቅር ትያትር",greenIcon);
        list4cinemaForm.append(" ራስ ትያትር",greenIcon);
        list4cinemaForm.append(" ካንዲ ትያትር",greenIcon);
        list4cinemaForm.append(" ንስር ትያትር እና ፕሮሞሽን",greenIcon);
        list4cinemaForm.append(" አለም ሲኒማ",greenIcon);
        list4cinemaForm.append(" ልጆች እና ወጣቶች ትያትር",greenIcon);
        list4cinemaForm.append(" ብሄራዊ ትያትር",greenIcon);
        list4cinemaForm.append(" አጎና ሲኒማ",greenIcon);
        list4cinemaForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4cinemaForm);
    }
    
    protected void mediaForm(){

        okCommand4mediaForm = new Command("ደውል", Command.OK, 0);
        list4mediaForm = new List("መገናኛ ብዙሃን", List.IMPLICIT);
        list4mediaForm.addCommand(back2StartApp);
        list4mediaForm.addCommand(okCommand4mediaForm);
        list4mediaForm.append(" የኢትዮጵያ ዜና አገልግሎት",greenIcon);
        list4mediaForm.append(" የኢትዮጵያ ሬድዮና ቴሌቪዥን ድርጅት",greenIcon);
        list4mediaForm.append(" ፋና ብሮድካስት ኮርፖሬት",greenIcon);
        list4mediaForm.append(" የኢትዮጵያ ፕሬስ ድርጅት",greenIcon);
        list4mediaForm.append(" ዋልታ ኢንፎርሜሽን ሴንተር",greenIcon);
        list4mediaForm.append(" ኤፍ ኤም 97",greenIcon);
        list4mediaForm.append(" ፋና ኤፍ ኤም",greenIcon);
        list4mediaForm.append(" ሸገር ኤፍ ኤም",greenIcon);
        list4mediaForm.append(" እፍሮ ኤፍ ኤም",greenIcon);
        list4mediaForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4mediaForm);
    }
    
    protected void policeForm(){

        okCommand4policeForm = new Command("ደውል", Command.OK, 0);
        list4policeForm = new List("ፖሊስ", List.IMPLICIT);
        list4policeForm.addCommand(back2StartApp);
        list4policeForm.addCommand(okCommand4policeForm);
        list4policeForm.append(" ፖሊስ",greenIcon);
        list4policeForm.append(" ፌደራል ፖሊስ",greenIcon);
        list4policeForm.append(" አዲስ አበባ ፖሊስ",greenIcon);
        list4policeForm.append(" ቦሌ ፖሊስ",greenIcon);
        list4policeForm.append(" ልደታ ፖሊስ",greenIcon);
        list4policeForm.append(" ቂርቆስ ፖሊስ",greenIcon);
        list4policeForm.append(" አራዳ ፖሊስ",greenIcon);
        list4policeForm.append(" የካ ፖሊስ",greenIcon);
        list4policeForm.append(" ንፋስ ስልክ ላፍቶ ፖሊስ",greenIcon);
        list4policeForm.append(" ኮልፌ ቀራኒዮ ፖሊስ",greenIcon);
        list4policeForm.append(" አቃቂ ቃሊቲ ፖሊስ",greenIcon);
        list4policeForm.append(" አዲስ ከተማ ፖሊስ",greenIcon);
        list4policeForm.append(" ጉለሌ ፖሊስ",greenIcon);
        list4policeForm.append(" አዲስ አበባ ትራፊክ ፖሊስ",greenIcon);
        list4policeForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4policeForm);
    }
    
    protected void hospitalForm(){

        okCommand4hospitalForm = new Command("ደውል", Command.OK, 0);
        list4hospitalForm = new List("ሆስፒታል", List.IMPLICIT);
        list4hospitalForm.addCommand(back2StartApp);
        list4hospitalForm.addCommand(okCommand4hospitalForm);
        list4hospitalForm.append(" \u12A0\u121D\u1261\u120B\u1295\u1235",greenIcon);
        list4hospitalForm.append(" አዲስ ካርዲያክ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" አዲስ ሕይወት ሆስፒታል",greenIcon);
        list4hospitalForm.append(" አለርት ሆስፒታል",greenIcon);
        list4hospitalForm.append(" አማኑኤል ሆስፒታል",greenIcon);
        list4hospitalForm.append(" አሰገደች ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ጦር ኃይሎች ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቤተዛታ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቤቴል ሆስፒታል",greenIcon);
        list4hospitalForm.append(" በጸጋህ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቢ ጂ ኤም ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ጥቁር አንበሳ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ብራስ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ኪዩር ኢትዮጲያ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ደጃች ባልቻ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ድንበሩ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ኢትዮ ጥበብ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ኢንተርናሽናል ካርዲዮቫስኩላር ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ፊስቱላ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ጋንዲ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ግሩም ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ሃያት ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ካዲስኮ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ላንድማርክ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ሚኒሊክ 2 ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ኤም ኤም ዲ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ኤም ሲ ኤም ኢትዮ ኮርያ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ናዝራዊት ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ፖሊስ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ራስ ደስታ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቅዱስ ገብርኤል ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቅዱስ ጳውሎስ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቅዱስ ጴጥሮስ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ቅዱስ ያሬድ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ተዘንያ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ጥበቡ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" የካቲት 12 ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ዘንባባ ሆስፒታል",greenIcon);
        list4hospitalForm.append(" ዘውዲቱ ሆስፒታል",greenIcon);
        list4hospitalForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4hospitalForm);
    }
    
    protected void fireForm(){

        okCommand4fireForm = new Command("ደውል", Command.OK, 0);
        list4fireForm = new List("እሳት አደጋ", List.IMPLICIT);
        list4fireForm.addCommand(back2StartApp);
        list4fireForm.addCommand(okCommand4fireForm);
        list4fireForm.append(" 1ኛ ጣቢያ ምኒልክ አደባባይ",greenIcon);
        list4fireForm.append(" 2ኛ ጣቢያ አዲሱ ቄራ",greenIcon);
        list4fireForm.append(" 3ኛ ጣቢያ መሳለሚያ",greenIcon);
        list4fireForm.append(" 4ኛ ጣቢያ ንፋስ ስልክ",greenIcon);
        list4fireForm.append(" 5ኛ ጣቢያ አቃቂ",greenIcon);
        list4fireForm.append(" 6ኛ ጣቢያ መገናኛ",greenIcon);
        list4fireForm.append(" 7ኛ ጣቢያ ቦሌ",greenIcon);
        list4fireForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4fireForm);
    }
    
    protected void airportForm(){

        okCommand4airportForm = new Command("ደውል", Command.OK, 0);
        list4airportForm = new List("አየር መንገዶች", List.IMPLICIT);
        list4airportForm.addCommand(back2StartApp);
        list4airportForm.addCommand(okCommand4airportForm);
        list4airportForm.append(" የኢትዮጵያ አየር መንገድ",greenIcon);
        list4airportForm.append(" የኬንያ አየር መንገድ",greenIcon);
        list4airportForm.append(" የግብፅ አየር መንገድ",greenIcon);
        list4airportForm.append(" የሳኡዲ አየር መንገድ",greenIcon);
        list4airportForm.append(" የየመን አየር መንገድ",greenIcon);
        list4airportForm.append(" ኢምሬትስ አየር መንገድ",greenIcon);
        list4airportForm.append(" ቢ ኤም አይ አየር መንገድ",greenIcon);
        list4airportForm.append(" ኬ ኤል ኤም ሮያል ደች አየር መንገድ",greenIcon);
        list4airportForm.append(" ሉፍታንዛ አየር መንገድ",greenIcon);
        list4airportForm.append(" ቱርክ አየር መንገድ",greenIcon);
        list4airportForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4airportForm);
    }
    
    protected void transportForm(){

        okCommand4transportForm = new Command("ደውል", Command.OK, 0);
        list4transportForm = new List("መጓጓዣ", List.IMPLICIT);
        list4transportForm.addCommand(back2StartApp);
        list4transportForm.addCommand(okCommand4transportForm);
        list4transportForm.append(" አንበሳ ባስ",greenIcon);
        list4transportForm.append(" ኢትዮ ጅቡቲ ባቡር",greenIcon);
        list4transportForm.append(" ኢትዮጵያ ሺፒንግ",greenIcon);
        list4transportForm.append(" ታክሲ ሰርቪስ (NTO)",greenIcon);
        list4transportForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4transportForm);
    }
    
    protected void libraryForm(){

        okCommand4libraryForm = new Command("ደውል", Command.OK, 0);
        list4libraryForm = new List("ቤተ መፅሀፍት", List.IMPLICIT);
        list4libraryForm.addCommand(back2StartApp);
        list4libraryForm.addCommand(okCommand4libraryForm);
        list4libraryForm.append(" ኬኔዲ ቤተ መፅሀፍ",greenIcon);
        list4libraryForm.append(" ብሪትሽ ካውንስል",greenIcon);
        list4libraryForm.append(" ናሽናል ቤተ መፅሀፍ",greenIcon);
        list4libraryForm.append(" ኢጣልያን ካልቸራል ኢንስቲትዩት",greenIcon);
        list4libraryForm.append(" አካዳሚ ኦፍ ኢትዮጵያን ላንጉጅ",greenIcon);
        list4libraryForm.append(" አዲስ ቤተ መፅሀፍ",greenIcon);
        list4libraryForm.append(" አላየንስ ኢትዮ ፍራንስስ",greenIcon);
        list4libraryForm.append(" ጀርመን ካልቸራል ኢንስቲትዩት",greenIcon);
        list4libraryForm.append(" አዲስ አበባ የሕዝብ ቤተ መፅሀፍ",greenIcon);
        list4libraryForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4libraryForm);
    }
    
    protected void bankForm(){

        okCommand4bankForm = new Command("ደውል", Command.OK, 0);
        list4bankForm = new List("ባንኮች", List.IMPLICIT);
        list4bankForm.addCommand(back2StartApp);
        list4bankForm.addCommand(okCommand4bankForm);
        list4bankForm.append(" አባይ ባንክ",greenIcon);
        list4bankForm.append(" አዲስ ኢንት ባንክ",greenIcon);
        list4bankForm.append(" አዋሽ ኢንት ባንክ",greenIcon);
        list4bankForm.append(" አቢሲኒያ ባንክ",greenIcon);
        list4bankForm.append(" ብርሃን ኢንት ባንክ",greenIcon);
        list4bankForm.append(" ቡና ኢንት ባንክ",greenIcon);
        list4bankForm.append(" ኮፕ ኦሮሚያ ባንክ",greenIcon);
        list4bankForm.append(" ንግድ ባንክ",greenIcon);
        list4bankForm.append(" ኮንስትራክሽን እና ቢዝነስ ባንክ",greenIcon);
        list4bankForm.append(" ዳሽን ባንክ",greenIcon);
        list4bankForm.append(" ዴቨሎፕመንት ባንክ",greenIcon);
        list4bankForm.append(" ደቡብ ግሎባል ባንክ",greenIcon);
        list4bankForm.append(" እናት ባንክ",greenIcon);
        list4bankForm.append(" አንበሳ ኢንት ባንክ",greenIcon);
        list4bankForm.append(" ንብ ኢንት ባንክ",greenIcon);
        list4bankForm.append(" ናሽናል ባንክ",greenIcon);
        list4bankForm.append(" ኦሮሚያ ኢንት ባን",greenIcon);
        list4bankForm.append(" ህብረት ባንክ",greenIcon);
        list4bankForm.append(" ወጋገን ባንክ",greenIcon);
        list4bankForm.append(" ዘመን ባንክ",greenIcon);
        list4bankForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4bankForm);
    }
    
    protected void insuranceForm(){

        okCommand4insuranceForm = new Command("ደውል", Command.OK, 0);
        list4insuranceForm = new List("ኢንሹራንሶች", List.IMPLICIT);
        list4insuranceForm.addCommand(back2StartApp);
        list4insuranceForm.addCommand(okCommand4insuranceForm);
        list4insuranceForm.append(" አባይ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" አዋሽ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" አፍሪካ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ብርሃን ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" የኢትዮጵያ ኢንሹራንስ ኮርፕ",greenIcon);
        list4insuranceForm.append(" የኢትዮጵያ ላይፍ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ግሎባል ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" አንበሳ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ናይስ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ናይል ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ኒያላ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ንብ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ኦሮሚያ ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ሰን ኢንሹራንስ",greenIcon);
        list4insuranceForm.append(" ህብረት ኢንሹራንስ",greenIcon);
        list4insuranceForm.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list4insuranceForm);
    }
    
    protected void imageCreater(){
        try{
            greenIcon = Image.createImage("green.png");
            yellowIcon = Image.createImage("yellow.png");
            redIcon = Image.createImage("red.png");
            blueIcon = Image.createImage("blue.png");
        }catch(Exception ex){System.out.println("Henok"+ex);}
    }

    public void startApp() {
        imageCreater();
        try{
            mainList();
        } catch (Exception e) {}
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable s){
        if (c== exitCommand) {
            notifyDestroyed();
        }
        else if(c==back2StartApp){
            startApp();
        }
        else if(c==okCommand4mainList){
            int index = mainList.getSelectedIndex();
            if(index==0){
                hospitalForm();
            }
            else if(index==1){
                policeForm();
            }
            else if(index==2){
                fireForm();
            }
            else if(index==3){
                insuranceForm();
            }
            else if(index==4){
                bankForm();
            }
            else if(index==5){
                hotelForm();
            }
            else if(index==6){
                cinemaForm();
            }
            else if(index==7){
                mediaForm();
            }
            else if(index==8){
                airportForm();
            }
            else if(index==9){
                transportForm();
            }
            else if(index==10){
                libraryForm();
            }
            else if(index==11){
                aboutMe();
            }
        }
        //Hotel Calls
        else if(c==okCommand4hotelForm){
            int index = list4hotelForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.ambasadorHotel);
            }
            else if(index==1){
                callTo(InformationCenter.airportHotel);
            }else if(index==2){
                callTo(InformationCenter.araratHotel);
            }else if(index==3){
                callTo(InformationCenter.atlasIntHotel);
            }else if(index==4){
                callTo(InformationCenter.axumHotel);
            }else if(index==5){
                callTo(InformationCenter.beshaleHotel);
            }else if(index==6){
                callTo(InformationCenter.centralShewaHotel);
            }else if(index==7){
                callTo(InformationCenter.concordHotel);
            }else if(index==8){
                callTo(InformationCenter.crownHotel);
            }else if(index==9){
                callTo(InformationCenter.diafriqHotel);
            }else if(index==10){
                callTo(InformationCenter.dimtriHotel);
            }else if(index==11){
                callTo(InformationCenter.desalegnHotel);
            }else if(index==12){
                callTo(InformationCenter.deleopalHotel);
            }else if(index==13){
                callTo(InformationCenter.dreamlinerHotel);
            }else if(index==14){
                callTo(InformationCenter.ethiopiaHotel);
            }else if(index==15){
                callTo(InformationCenter.extremeHotel);
            }else if(index==16){
                callTo(InformationCenter.genetHotel);
            }else if(index==17){
                callTo(InformationCenter.geonHotel);
            }else if(index==18){
                callTo(InformationCenter.globalHotel);
            }else if(index==19){
                callTo(InformationCenter.harambeHotel);
            }else if(index==20){
                callTo(InformationCenter.harmoneyHotel);
            }else if(index==21){
                callTo(InformationCenter.hiltonHotel);
            }else if(index==22){
                callTo(InformationCenter.imperialHotel);
            }else if(index==23){
                callTo(InformationCenter.intercontinentalHotel);
            }else if(index==24){
                callTo(InformationCenter.iyerusalemHotel);
            }else if(index==25){
                callTo(InformationCenter.jupiterHotel);
            }else if(index==26){
                callTo(InformationCenter.kingsHotel);
            }else if(index==27){
                callTo(InformationCenter.lalibelaHotel);
            }else if(index==28){
                callTo(InformationCenter.meridianHotel);
            }else if(index==29){
                callTo(InformationCenter.nationalHotel);
            }else if(index==30){
                callTo(InformationCenter.plazaHotel);
            }else if(index==31){
                callTo(InformationCenter.nigistesabaHotel);
            }else if(index==32){
                callTo(InformationCenter.panoramaHotel);
            }else if(index==33){
                callTo(InformationCenter.rasambaHotel);
            }else if(index==34){
                callTo(InformationCenter.rasHotel);
            }else if(index==35){
                callTo(InformationCenter.riveraHotel);
            }else if(index==36){
                callTo(InformationCenter.semenHotel);
            }else if(index==37){
                callTo(InformationCenter.sheratonHotel);
            }else if(index==38){
                callTo(InformationCenter.wabishebeleHotel);
            }else if(index==39){
                callTo(InformationCenter.yoilHotel);
            }else if(index==40){
                callTo(InformationCenter.yordanosHotel);
            }
        }//Cinema Calls
        else if(c==okCommand4cinemaForm){
            int index = list4cinemaForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.ambasadorCinema);
            }
            else if(index==1){
                callTo(InformationCenter.megamafitiyatirCinema);
            }else if(index==2){
                callTo(InformationCenter.cityhalCinema);
            }else if(index==3){
                callTo(InformationCenter.ednamolmatiCinema);
            }else if(index==4){
                callTo(InformationCenter.hagerfikirTiyatir);
            }else if(index==5){
                callTo(InformationCenter.rasTiyatir);
            }else if(index==6){
                callTo(InformationCenter.kandiTiyatir);
            }else if(index==7){
                callTo(InformationCenter.nisirTiyatirandPromotion);
            }else if(index==8){
                callTo(InformationCenter.alemCinema);
            }else if(index==9){
                callTo(InformationCenter.ligochandwetatochTiyatir);
            }else if(index==10){
                callTo(InformationCenter.biherawiTiyatir);
            }else if(index==11){
                callTo(InformationCenter.agonaCinema);
            }
        }//media Calls
        else if(c==okCommand4mediaForm){
            int index = list4mediaForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.ethiopianzenaagelgelot);
            }
            else if(index==1){
                callTo(InformationCenter.erta);
            }else if(index==2){
                callTo(InformationCenter.fbc);
            }else if(index==3){
                callTo(InformationCenter.ethiopiapressorg);
            }else if(index==4){
                callTo(InformationCenter.waltainformationcenter);
            }else if(index==5){
                callTo(InformationCenter.fm97);
            }else if(index==6){
                callTo(InformationCenter.fanafm);
            }else if(index==7){
                callTo(InformationCenter.shegerfm);
            }else if(index==8){
                callTo(InformationCenter.afrofm);
            }
        }//police Calls
        else if(c==okCommand4policeForm){
            int index = list4policeForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.polic);
            }
            else if(index==1){
                callTo(InformationCenter.federalPolice);
            }else if(index==2){
                callTo(InformationCenter.addisAbabaPolice);
            }else if(index==3){
                callTo(InformationCenter.bolePolice);
            }else if(index==4){
                callTo(InformationCenter.lidetaPolice);
            }else if(index==5){
                callTo(InformationCenter.kirkosPolice);
            }else if(index==6){
                callTo(InformationCenter.aradaPolice);
            }else if(index==7){
                callTo(InformationCenter.yekaPolice);
            }else if(index==8){
                callTo(InformationCenter.nifasSilkLaftoPolice);
            }else if(index==9){
                callTo(InformationCenter.kolfeKeranyoPolice);
            }else if(index==10){
                callTo(InformationCenter.akakeKalitiPolice);
            }else if(index==11){
                callTo(InformationCenter.addisKetemaPolice);
            }else if(index==12){
                callTo(InformationCenter.gulelePolice);
            }else if(index==13){
                callTo(InformationCenter.addisAbabaTraficPolice);
            }
        }//hospital Calls
        else if(c==okCommand4hospitalForm){
            int index = list4hospitalForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.ambulance);
            }
            else if(index==1){
                callTo(InformationCenter.addisKardiak);
            }else if(index==2){
                callTo(InformationCenter.addisHiwot);
            }else if(index==3){
                callTo(InformationCenter.alert);
            }else if(index==4){
                callTo(InformationCenter.amanuel);
            }else if(index==5){
                callTo(InformationCenter.asegedech);
            }else if(index==6){
                callTo(InformationCenter.torHayloch);
            }else if(index==7){
                callTo(InformationCenter.beteZata);
            }else if(index==8){
                callTo(InformationCenter.betel);
            }else if(index==9){
                callTo(InformationCenter.betsegah);
            }else if(index==10){
                callTo(InformationCenter.bgm);
            }else if(index==11){
                callTo(InformationCenter.tikurAnbessa);
            }else if(index==12){
                callTo(InformationCenter.biras);
            }else if(index==13){
                callTo(InformationCenter.cureEthiopia);
            }else if(index==14){
                callTo(InformationCenter.degachBalcha);
            }else if(index==15){
                callTo(InformationCenter.dinberua);
            }else if(index==16){
                callTo(InformationCenter.ethioTibeb);
            }else if(index==17){
                callTo(InformationCenter.internationalCardiovascular);
            }else if(index==18){
                callTo(InformationCenter.festula);
            }else if(index==19){
                callTo(InformationCenter.ganide);
            }else if(index==20){
                callTo(InformationCenter.girum);
            }else if(index==21){
                callTo(InformationCenter.hayat);
            }else if(index==22){
                callTo(InformationCenter.kadisko);
            }else if(index==23){
                callTo(InformationCenter.landmark);
            }else if(index==24){
                callTo(InformationCenter.minelek2);
            }else if(index==25){
                callTo(InformationCenter.mmd);
            }else if(index==26){
                callTo(InformationCenter.mcmEthioKorea);
            }else if(index==27){
                callTo(InformationCenter.nazrawet);
            }else if(index==28){
                callTo(InformationCenter.police);
            }else if(index==29){
                callTo(InformationCenter.rasDeseta);
            }else if(index==30){
                callTo(InformationCenter.kidusGebreal);
            }else if(index==31){
                callTo(InformationCenter.kidusPawlos);
            }else if(index==32){
                callTo(InformationCenter.kidusPetros);
            }else if(index==33){
                callTo(InformationCenter.kidusYared);
            }else if(index==34){
                callTo(InformationCenter.tezeniya);
            }else if(index==35){
                callTo(InformationCenter.tibebu);
            }else if(index==36){
                callTo(InformationCenter.yekatit12);
            }else if(index==37){
                callTo(InformationCenter.zenbaba);
            }else if(index==38){
                callTo(InformationCenter.zewdetu);
            }
        }//fire Calls
        else if(c==okCommand4fireForm){
            int index = list4fireForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.firstTabiya);
            }
            else if(index==1){
                callTo(InformationCenter.secondTabiya);
            }else if(index==2){
                callTo(InformationCenter.thirdTabiya);
            }else if(index==3){
                callTo(InformationCenter.fourthTabiya);
            }else if(index==4){
                callTo(InformationCenter.fifthTabiya);
            }else if(index==5){
                callTo(InformationCenter.sixthTabiya);
            }else if(index==6){
                callTo(InformationCenter.seventhTabiya);
            }
        }//airport Calls
        else if(c==okCommand4airportForm){
            int index = list4airportForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.ethiopiaAirport);
            }
            else if(index==1){
                callTo(InformationCenter.kenyanAirport);
            }else if(index==2){
                callTo(InformationCenter.egyptAirport);
            }else if(index==3){
                callTo(InformationCenter.saudiAirport);
            }else if(index==4){
                callTo(InformationCenter.yemenAirport);
            }else if(index==5){
                callTo(InformationCenter.emiratesAirport);
            }else if(index==6){
                callTo(InformationCenter.bmiAirport);
            }else if(index==7){
                callTo(InformationCenter.klmroyaldechAirport);
            }else if(index==8){
                callTo(InformationCenter.lufthansaAirport);
            }else if(index==9){
                callTo(InformationCenter.turkAirport);
            }
        }//transport Calls
        else if(c==okCommand4transportForm){
            int index = list4transportForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.anbessaBus);
            }
            else if(index==1){
                callTo(InformationCenter.ethiodjibotiRailway);
            }else if(index==3){
                callTo(InformationCenter.ethiopiashippingShip);
            }else if(index==4){
                callTo(InformationCenter.ntotaxiService);
            }
        }//library Calls
        else if(c==okCommand4libraryForm){
            int index = list4libraryForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.kennedyLib);
            }
            else if(index==1){
                callTo(InformationCenter.britishCouncil);
            }else if(index==2){
                callTo(InformationCenter.nationalLib);
            }else if(index==3){
                callTo(InformationCenter.italianculturalInstitute);
            }else if(index==4){
                callTo(InformationCenter.acadofethiopianLanguage);
            }else if(index==5){
                callTo(InformationCenter.addisLib);
            }else if(index==6){
                callTo(InformationCenter.alianceethioFransic);
            }else if(index==7){
                callTo(InformationCenter.germanculturalInstitute);
            }else if(index==8){
                callTo(InformationCenter.addisababapublicLib);
            }
        }//bank Calls
        else if(c==okCommand4bankForm){
            int index = list4bankForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.abayBank);
            }
            else if(index==1){
                callTo(InformationCenter.adisintBank);
            }else if(index==2){
                callTo(InformationCenter.awashintBank);
            }else if(index==3){
                callTo(InformationCenter.abysinyaBank);
            }else if(index==4){
                callTo(InformationCenter.birhanintBank);
            }else if(index==5){
                callTo(InformationCenter.bunaintBank);
            }else if(index==6){
                callTo(InformationCenter.coporomiaBank);
            }else if(index==7){
                callTo(InformationCenter.nigidBank);
            }else if(index==8){
                callTo(InformationCenter.constructionandbusinessBank);
            }else if(index==9){
                callTo(InformationCenter.dashenBank);
            }else if(index==10){
                callTo(InformationCenter.developmentBank);
            }else if(index==11){
                callTo(InformationCenter.debubglobalBank);
            }else if(index==12){
                callTo(InformationCenter.inatBank);
            }else if(index==13){
                callTo(InformationCenter.anbessaintBank);
            }else if(index==14){
                callTo(InformationCenter.nibintBank);
            }else if(index==15){
                callTo(InformationCenter.nationalBank);
            }else if(index==16){
                callTo(InformationCenter.oromiaintBank);
            }else if(index==17){
                callTo(InformationCenter.hibretBank);
            }else if(index==18){
                callTo(InformationCenter.wegagenBank);
            }else if(index==19){
                callTo(InformationCenter.zemenBank);
            }
        }//insurance Calls
        else if(c==okCommand4insuranceForm){
            int index = list4insuranceForm.getSelectedIndex();
            if(index==0){
                callTo(InformationCenter.abayInsurance);
            }
            else if(index==1){
                callTo(InformationCenter.awashinsurance);
            }else if(index==2){
                callTo(InformationCenter.africaInsurance);
            }else if(index==3){
                callTo(InformationCenter.birhanInsurance);
            }else if(index==4){
                callTo(InformationCenter.ethiopianInsuranceCorp);
            }else if(index==5){
                callTo(InformationCenter.ethiopianLifeInsurance);
            }else if(index==6){
                callTo(InformationCenter.globalInsurance);
            }else if(index==7){
                callTo(InformationCenter.anbessaInsurance);
            }else if(index==8){
                callTo(InformationCenter.niceInsurance);
            }else if(index==9){
                callTo(InformationCenter.nileInsurance);
            }else if(index==10){
                callTo(InformationCenter.nyalaInsurance);
            }else if(index==11){
                callTo(InformationCenter.nibInsurance);
            }else if(index==12){
                callTo(InformationCenter.oromiaInsurance);
            }else if(index==13){
                callTo(InformationCenter.sunInsurance);
            }else if(index==14){
                callTo(InformationCenter.hibretInsurance);
            }
        }
    }
}
