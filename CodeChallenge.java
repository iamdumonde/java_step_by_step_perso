public class CodeChallenge {

    public static void main(String[] args) {

        String inversedText = ".rosért nu tse liavart el euQ trom as tnava rertnom ruel eD egas tuf erèp el siaM .éhcac ed tniop ,tnegra'D .egatnavad atroppar ne lIna'l ed tuob ua'uq neib is ; tuotrap ,àled ,àçeD pmahc el tnenruoter suov slif sel ,trom erèp eL .essaper te essap en niam al ùO ecalp ellun zessial en ; zehcêb ,relliuof ,zesuerC .tûO'l tiaf arua no'uq sèd pmahc ertov zeumeR .tuob à zerdneiv ne suov ,revuort aref el suoVegaruoc ed uep nu siam ; tiordne'l sap sias en eJ .snaded éhcac tse rosért nU .stnerap son éssial tno suon euQ egatiréh'l erdnev ed ,li-tid ruel ,suov-zedraG .sniomét snas alrap ruel ,stnafne ses rinev tiF,eniahcorp trom as tnatnes ,rueruobaL ehcir nU .sniom el euqnam iuq sdnof el tse'C : eniep al ed zenerp ,zelliavarT";

        // System.out.println(inversedText);

        String reverseText = "";
        
        for(int i = 0; i < inversedText.length(); i++){
            // inversedText.charAt(i);
            reverseText = inversedText.charAt(i) + reverseText;
        }
        System.out.println(reverseText);
    }
}
