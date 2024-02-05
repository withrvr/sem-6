%{
int linecount=0, charcount=0;
%}


%%
. { charcount++; }
\n { linecount++; charcount++; }
[\t] { return 1; }
%%


void main() {
    yylex();
    printf("# of lines = %d, # of chars = %d", linecount, charcount);
}

