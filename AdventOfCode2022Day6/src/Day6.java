import java.util.ArrayList;
import java.util.List;


public class Day6 {
    public static void main (String[] args) {
        {
            ArrayList<String> stringList = new ArrayList<>(List.of("zdrrgvvntvtzzssgcgqqbvqqzmqmrrprjjpmpwpvpqpwppfqqnvvjbjcbbrnnvwnvnqnncvvqnvqvmmdzdrzzjmmfzmztzczzjpjllgzgnzgznzpzhhvppmjjtbjbjgbjjpfphfhthpprbbzzhbzzvjjsttjwtjwjllzplzlhlqlfqfvflfvlvqvqsshccgffvzzqllpjllcqcpqcpqccbgcccvwvlldclcppcggjhhtbhbrbwbllldndhnnmnmcccvfvtftrfttlhttgltlflgflfrrftrtrgrmggbccnvccvssbmsmnsmszmmsbshbhpbhhtccnmngmnnntznttwnnmffdccrhrshhzhszslzlqqqsqhhrrvmrrhrmhrrdppshpssjhhhtzhzpzzzbrrqqhhtltgltgghlhpphmmbllczcgcrgcrcmmdjdvdssdbsshqqrprhrfrqrlldggpglplqlgqqvfqqwhqqclcwwbrbwbzzmcczqqpzpzhpzprrsbsfsgscsvsdsnntssgzsgzzdpdmmvnnnnfgngnqntnqnhqnhnrrdvrdvvhcvhcvvmffmccdndhhpghgwwdpwwsbwwwcpchcmmznnvtvfffzgffmfdmdsdrrsjjblbglgrrnllzrlrnnrzztnnnqlnlhnllnflllvjjdpdnngfnnlzlrzllrnlnznszzhhvggbqqcmqqvhqhhzfznnhthlhfllqwwghwgwnnnrcchffqnqjjmhjmjsjrjjrwjrrhbhfbhffprprhrddscddbbrzrvrcclttppvrvrlrplpffdwffwrwvvmssgjjbttpgpfplffgfwfnnmhhwghhpfptprtrzzwlwnwmwzzbmbrrdjrjzjpzpggftffglgzzdgzgbbzwzrrdzdhdbhhfppvrvrrrshrrzwwhjwwtjjhbhgbbhjhmmcvvchcfczfcffgttzbzssdqqjwjbbhthgthghthghmhlmmjwmwccfftnnddlffntnhtnhhnnldlhlthhqvhqvhhcgclcmmcnnwnqqzgzczccftfzfrrnhnjhhnlljdjhjghhchvchvchcphpnnnznhnjjlmjlmlbmmsbmbnnmqmvmhhcrcvvqffjpjzpjzjnnhsnhsslqlqvqzzmffdtfdffjrfjrjcjzjnjfjdfjfvjvddtntcttcwcqwqlqjqlqrrzccsgsgffwddrldrrhlllgppghphddqttdwtwnwlnlccmwwfnngvnvddwvwttjjsgghcchjjnvnccjljcljcljjjrttdstsmsggdbdbnddqpddbqqpbpdpgdpdnpnbnffcfrfrfhfcfgcfgcffvjvccgscshhvthvthtbhtbbmppjjrjqrjqjmjzjjjvffmbbfppndngnrnsnnmbbcmcddfzdfzdffqssfwsfwwpzpfpmpqpjqjwqqzwqwvvsddvrrdsrszrrrjqrjjqtqftthhmpmhpmhphggjsggjpppmhmzzdllcscpsswsqqjsqsvvlffmwgtmbthswfqqppsdflzhmdbcnzgdrlzccsdtptgmhfhwtbwqdhptvsvgdfdsmvsrtjjthchmbrjpmrwhgrdllphnfhrfdlgqmbrtdwcmcbphrzthflcswnhqmfhwprbgczbmsmjvbwjftgfqhbhqgzsvcpplzgctzggfljbmhsmwcwltllqgqtvhlbnpzpccbsbhpvhttdjvcnbqhlccdcclwfvcqnttlzzhqpltnnzzlnwtgppwfvmjhtmlzbzdrgbpbbmwlczdwmfhsvpnhpcqwzlnzslncdcqblvlpqfzhhszzrssvhglsllbbmjngfjlpjjvjbzbrlrmwfvzbgtzvcrshtsswhjrjvtwwbrqvtqnndndthfgfcnprpwwtffcvmllngsftrnwnjmwfljjtwnqqmphdlctvdpnsmbrhmljzmfvhcpblmwjjgqvslgslpbjzqzgzpwgssljztmztbwbqlfwrwgvwrjzvpvncqpdspgpzsjnvcrtzpnspvmnvssbgmsbpdsmcvjmtczczzsjcqcfhvcmsbsjfsssvzpvrtmmgptpcsrjslgvclflhjdpwtsmrgjjcftjmjrzrpwqlqvrqjpflbgrfhswbpcnvrrwpzqtzmqjspqqpwlcwgwgclpnwhhrrmzvvnjrjgjfqftlwjrggjgsdfvqhghmshczbbcvrmsgfdqhhmpfzqtbqwsmwfnwfwndjtlntzbbhlzlhrlzgljlmlbcwcdzbctlbqjmfpdwfcfnrbztvlwjhgmfvjcclcrwwwwvqshnfthtcccnswnfzlznlfcmcfrrsjqfvrwjvtbrwggzmdglcbzfdflrdqsjhzcjpghdmwhzrshnqqtsrccbhnlqcsclwmnvjpfqjszwrqnvbgmcdsvhntqmmnrdpbtpqwvhztmtjfvdplgzhhgsrnbwggnwzbtzwcsbrftzhvwtrwvcqrbcnqnrcmbmsvlcfbmzfcvqpwsmmfdgssnhghwjlsslmgnrqgpmbhpqzfnvztsjzjqgrzbbdpvtprwdzdszlhpcgwvdfvhtbtpfjnqnpzwplrwnfdpdclwgnrjlzzshhcchswtzrcmrfpgwjvttqfbbsdnctrtnmwqsmnfsgfgplphcrhglcrnrbzvcfrdfhdtsjmnvfwslcntttqzvhhbljzmpmlsrsblhvmvphppdmjfzwfmflcfwwtdfcndqzgsbrcppsngqfnnjtccnmfjqzhdpnnrqvhrmnrwntqrvmlzfrdszhctzjjdwqrrldtqgrztrvdfrpgprqhqrbnmpfzzlprrpqgtqmzshpcdbwgmrqhrvvgwvspqzmsrvprvsclffwhzlvgfgcsjtmnmthwfmdnfccvlbwbcrlsghhpzcvcnffvccsqjtnhhnbwgfjmqczbrfmjtmmbznspmvtcvdllbgrcvtdzpgzcjzqdjpglhbbnbvwztrdhcrcvrpbshwlmdbmpdgzzflglwgfhvngcgpwshfhzsbrmnhrftmcfqdhnmfmdzbzfgggrzchtzrhgtjpqhdglgdhdqzqpmqmtsbbjjgvtrngdvghwdmgnmdlwsvpmldlsjrtwhltfpbmqlngncwspcptphdppdmjfvtnmdrpbwzrdzcqjdnprpcddjqjhpllsrqzdpcpnplmnmwfqjtnfmnwljbsfgwlgjpwdbbqblvsqcvvgmbrhsqjcscsflcfdzbnrflmrpzhzdhzqhgvmtfjpwtfqnclplgwrjtfvrncjlqtqlrrnjsrvpwbrdcppvnjfzdrzhcltpdfgfndvqtqzvvztgzssdsvvvjwrtjmqcchbjmppqzmgwqdvmmdqbcpbmcnjsvjlwmmnvmnlzdsnsjpldgpjgsbqmpcdsvhdfhgpbggqmrdhbhvvpnzdpqtmldmfqdfchzdfgddzgvcdzgcwjlhnzjwhpwlfwhgjthjshqtzbblhflmsfvtwplfpmpndgjmhndqlhcvfhmjmmqgnjstrzqvshzbbsfqwszwccmrcjnmlsplqzwrgrcwqbmrfwljmlqtqztscrhgjdqzhvmhncvssfznpgrbrjvchsgnjjnnqqrqwsqsrgmltvgtjvpztwmsspjtqdwrbftzrbcmdthmztmnqtmmnffqjjzbvwghrsdmbbjsnnhbdcbqsbcdmwqqppcvsndzbfnsgtpptdftrfthdclqrqvmhnddmjzlnfgscfdwjljjgjnddcrzvclfqbdhprttwpmsnzvdgzwmnzznpqhlhhslwgzlczlgvbjbgqdczztzjnswphllncbsqdmbsbqqsltzmmhmhfnngbttvdsmfrpgthwpfdhsstrjssghlrrlhbmgdsvhzvlhhfvtcrrhlndgrjjcgmjwgnjtlmpmzgqgpnpsvlnthgrvsdfcnmzmthqzfpjdqjbhgmjqsqvvdldrgqwlghdlwqdbfmffgvzmptqhnvbrdbqtcjmsdnjljpbrtcvvnffvztbwfnmtvdbnshlbgvbnljntlrldbwqvqmblnvhwtw"
            ));
            for (String x : stringList) {
                boolean isFound;
                int count = 0;
                for (int i = 0; i < x.length() - 13; i++) {
                    int za = 1;
                    isFound = false;
                    char[] chars = x.substring(i, i + 14).toCharArray();
                    for (Character y : chars
                    ) {
                        for (int j = za; j < chars.length; j++) {
                            if (y == chars[j]) {
                                isFound = true;
                                break;
                            }
                        }
                        za++;
                        if (isFound) {
                            break;
                        }
                    }
                    if (!isFound) {
                        count = i + 14;
                        break;
                    }
                }
                System.out.println(count);
            }
        }
    }
}