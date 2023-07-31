# Caesar Cipher and Breaker

This project consists of two Java classes, `CaesarCipher` and `CaesarBreaker`, which provide functionality for encrypting and decrypting messages using the Caesar cipher algorithm. The Caesar cipher is a substitution cipher that shifts characters in the alphabet by a fixed number of positions.

This is a Coursera course assignment.
Course:
Java Programming: Arrays, Lists, and Structured Data
https://www.coursera.org/learn/java-programming-arrays-lists-data?specialization=object-oriented-programming

## Usage

1. Import the `edu.duke.*` library from the Duke University Java course [available here](https://www.dukelearntoprogram.com//downloads/archives/duke-java-2020.zip).

2. Use the `CaesarCipher` class to encrypt messages with a given key or with two keys (for odd and even characters).

3. Use the `CaesarBreaker` class to decrypt messages encrypted with the Caesar cipher.

## Class Descriptions

### CaesarCipher

The `CaesarCipher` class provides methods for encrypting and decrypting messages using the Caesar cipher algorithm.

#### Methods

- `encrypt(String input, int key)`: Encrypts a message using a single key.
- `replaceLetter(String input, String alphabet, int key)`: Helper method for `encrypt` that replaces characters in the input string with shifted characters based on the key.
- `encryptTwoKeys(String input, int key1, int key2)`: Encrypts a message using two keys, one for odd and one for even characters.
- `replaceLetterTwoKeys(String input, String alphabet, int key1, int key2)`: Helper method for `encryptTwoKeys` that replaces characters in the input string with shifted characters based on the two keys.
- `testCaesar()`: Tests the encryption and decryption methods with sample messages.

### CaesarBreaker

The `CaesarBreaker` class provides methods for breaking and decrypting messages encrypted with the Caesar cipher.

#### Methods

- `countLetters(String message)`: Counts the occurrences of each letter in the message.
- `maxIndex(int[] vals)`: Finds the index of the maximum value in an integer array.
- `decrypt(String encrypted)`: Decrypts an encrypted message using a single key.
- `halfOfString(String message, int start)`: Splits a message into two strings, one with odd characters and the other with even characters.
- `getKey(String s)`: Determines the key used to encrypt a message.
- `decryptTwoKeys(String encrypted)`: Decrypts an encrypted message using two keys (one for odd and one for even characters).
- `testDecrypt()`: Tests the decryption methods with sample encrypted messages.

## Example

The two keys that were used to encrypt are: 17 and 4

Encrypted:

Xifqvximt tsdtlxzrx iijirvtl ek Uybi afvbw yehvv xyi gfqdse iekmfrrpzdrxzse fj xyi jzich sw tsdtlxrxzseec xifqvxic, fjkie xmmie zr xyi trwk, xyek klv nsipu rvfyeh yj zw xyvvi-hzqvrjmfrrp eeh ulijxzsew lfa xymekj zr xymj nsipu iiceki xf vetl sklvv eii melvvvrkpp xifqvximt. Xrov dsmmek e tzees xyvfyxl e hfsi-wvrqv rru gprremek e jcmxlk-gekl xyek rzfmuw gfpcmjmfrj nmkl sklvv ezvgprrvw ej kaf vbrqgpvw. Zx wyslpu klvvvjfvv esk jyitimji xyek tsdtlxzrx gvftvvkmvw esslx xyiji kvsdikvzg xymekj rru klvmi zrkiietxzse rvv tsdqfr-tceti eeh mdtfvkeex. Nlzpv klzw mj jxzpc r mecmu rvxydiex, ni afych pzov ks edieh xyek dsjx sw klv xifqvximt hyvwkmfrj giftci gfrtiir xyidwvpmij nmkl lrzv ks hf nmkl lfa xymekj rvv tservgkiu. Mk zw mdtfvkeex xyek ymxlnepw eii wljwmtmvrkpp jxiezkyx eeh wdsfxy ks wltgsix xyi himmmek sw wejx grvj, flx eesklvv ijwvrkmrp tisgiixp, aymtl av lwlecpp kebi jfv kieexvh, zw xyek ymxlnepw eii gfrkmeyfyj, mehviu tservgkmek E xf S, eeh rfx nlwk rtgvfbzqrxvpp. Xyi gfviijtfrumek wlfwmvpu fj gfqgykekmfrrp kvsdikvp zw swxvr vvjvviiu ks ej tsdtlxrxzseec ksgscsxc. R xsfh tfvkmfr sw fyi vjwsixj dep si gcejwzjziu ks fvpfrx ks xymj jysjzich eeh eii himmie sc egtcmtekmfrj zr e zrvzikc sw fxyii wmvpuw, klv gvvhzgkmfr sw klv jxiytxlvv fj jfpuiu gvfxvmew eeh xyi vvgfrjxiytxzse fj llqrr sikrrj sizrx kaf. Xyi lrpcqrvb fj slv afvb zw jrwk rpxsimkldw xyek zqgpvqvrk deklvqrxzgrp qfhvpj ks swjvv mewzkyxj zrks eeh eewniiw xf jytl ulijxzsew.

Av rvv vbgpfvzrx zwjyvw wlgy rw lfa xvgyrzulij wsi jsczzrx gvffcidw grr fv umjgfzvvvh, zqgvfzvh, rrrppdvh, rru uidsewkvrxvh xf si gfviitx si ftkmdec. Av vbgitx xf debi pveumek gfrkvzflxzsew me tsdtlxrxzseec xifqvxic, xifqvximt dsuicmek, ueke wkvlgkyiij, lzky-giijfvdeegv tsdtlxzrx, M/S-iwjzgziegp wsi vbkiirrp qvqfvp, kvsxvrtymt zrwsiqrxzse jcjxvqj (KZW), fzscsxmtec tsdtlxzrx, eeh hrxr tsdtiijwzse.

Sitelwv fj xyi kvsdikvzg rrxlvv fj xyi tycjmtec nsipu zr aymtl av cmmi, xifqvximt gvffcidw eimji me rrp rvve xyek zrkiietxj nmkl xyi tycjmtec nsipu. Kvsdikvzg gfqgykmek jfglwvw se uijmxrzrx, eeeccqmek, rru zqgpvqvrkmek iwjzgziex eckfvzxyqj wsi xifqvximt gvffcidw. Klv xifqvximt tsdtlxzrx xvfyg fj xyi hvtrvkqvrk zw mexvveekmfrrpcc vvrfaeiu wsi zxj tseximsykmfrj ks xyi jlruediexrp tisspvqj zr gfqgykekmfrrp kvsdikvp, euhiijwzrx dejwzzv ueke qrrrkvqvrk zwjyvw me xifqvximt gvffcidw, rru rtgppmek kvsdikvzg xvgyrzulij ks e zrvzikc sw rvvej, megcyumek qfpvglprv fzscsxc, xifqvximt dsuicmek, issskmtw, xifkieglzg mejfvdekmfr wpwkidw, vgfpfkp, eeh tysksemtw.

Xyi kislt etxzzvpp tscprffvrxvw azxy fxyii xvfygw azxyme klv uigeixdiex eeh azxy klv iijirvtlvvj zr sklvv hvtrvkqvrkw ek Uybi. Klvc gfpcessieki azxy wetycxp zr Qrxyidekmtw, Smfpfkp, Fzstlvqzwkvp, Icitximtec rru Tsdtlxvv Iekzrviimek, rru klv Emtlfprw Wtlfsc fj Iezzvfrdiex. Sipseh Hlov, xyi kislt ecwf tscprffvrxvw azxy iijirvtlvvj rx zrvzslw xft mewkmkykij. Fvgryji sw zxj uigxy rru svveuxy, xyi kvsdikvzg gfqgykmek kislt ek Uybi mj rvxyrfcc xyi xft kvsdikvzg gfqgykmek kislt me klv eekmfr.

Decrypted:

Geometric computing research at Duke works under the common rationalization of the field of computational geometry, often given in the past, that the world around us is three-dimensional and questions how things in this world relate to each other are inherently geometric. Take moving a piano through a door-frame and planning a flight-path that avoids collisions with other airplanes as two examples. It should therefore not surprise that computing properties about these geometric things and their interaction are common-place and important. While this is still a valid argument, we would like to amend that most of the geometric questions people concern themselves with have to do with how things are connected. It is important that highways are sufficiently straight and smooth to support the driving of fast cars, but another essential property, which we usually take for granted, is that highways are continuous, indeed connecting A to B, and not just approximately. The corresponding subfield of computational geometry is often referred to as computational topology. A good portion of our efforts may be classified to belong to this subfield and are driven by applications in a variety of other fields, the prediction of the structure of folded proteins and the reconstruction of human organs being two. The hallmark of our work is fast algorithms that implement mathematical models to offer insights into and answers to such questions.

We are exploring issues such as how techniques for solving problems can be discovered, improved, analyzed, and demonstrated to be correct or optimal. We expect to make leading contributions in computational geometry, geometric modeling, data structures, high-performance computing, I/O-efficiency for external memory, geographic information systems (GIS), biological computing, and data compression.

Because of the geometric nature of the physical world in which we live, geometric problems arise in any area that interacts with the physical world. Geometric computing focuses on designing, analyzing, and implementing efficient algorithms for geometric problems. The geometric computing group of the department is internationally renowned for its contributions to the fundamental problems in computational geometry, addressing massive data management issues in geometric problems, and applying geometric techniques to a variety of areas, including molecular biology, geometric modeling, robotics, geographic information systems, ecology, and photonics.

The group actively collaborates with other groups within the department and with the researchers in other departments at Duke. They collaborate with faculty in Mathematics, Biology, Biochemistry, Electrical and Computer Engineering, and the Nicholas School of Environment. Beyond Duke, the group also collaborates with researchers at various top institutes. Because of its depth and breadth, the geometric computing group at Duke is arguably the top geometric computing group in the nation.
