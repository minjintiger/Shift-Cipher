# Shift-Cipher

This is a program that has encryption and decryption method of Shift-Cipher.
Shift Cipher uses a key which is a number between 0 and 25 since we are using alphabet which is mod 26.
And, the input String must be alphabet, ignoring case.
When it encrypts, it will add the key on each string alphabet, as a result, the string will be encrypted.
When it decrypts, it will substract the key on each string alphabet, as a result, the string will be decrypted.


Example(Encryption)

    Input:    I Love you 
    Key:      5

    Input:    I(8) L(11) O(14) V(21) E(4) Y(24) O(14) U(20)
    Key:        5     5     5     5    5     5     5     5     
    Encrypted: 13    16    19 (26)0    9 (29)3    19    25

    Result:     N     Q     T     A    J     D     T     Z

    Input:  I Love you
    Result: N QTAJ DTZ 

Example(Decryption)

    Input:    N QTAJ DTZ 
    Key:      5

    Input:   N(13) Q(16) T(19)  A(0) J(9)  D(3) T(19) Z(25)
    Key:        5     5     5     5    5     5     5     5     
    Encrypted:  8    11    14    21    4    24    14    20

    Result:     I     L     O     V    E     Y     O     U

    Input:  N QTAJ ITZ
    Result: I Love you
