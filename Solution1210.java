CharArrayWriter rot13 = new CharArrayWriter() ;
for (char c : i ) {
    char lc = Character.toLowerCase(c) ;
    rot13.append( c += ( (lc >= 'a' && lc <= 'm') ? 13 : ( (lc >= 'n' && lc <= 'z') ? -13 : 0 ) )) ;
}

CharArrayWriter rot47 = new CharArrayWriter() ;
for (char c : i ) 
    rot47.append( c += ( (c >= '!' && c <= 'O') ? 47 : ( (c >= 'P' && c <= '~') ? -47 : 0 ) )) ;