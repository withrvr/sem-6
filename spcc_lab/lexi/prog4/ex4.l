%{
void display(int, char *);
int flag;
%}


%%
[a|e|i|o|u] { flag=1; display(flag, yytext); }
. { flag=0; display(flag, yytext); }
%%


void main() {
    printf("enter the word:");
    yylex();
}

void display(int flag, char *t) {
    if(flag == 1) {
        printf("\nvowel %s\n", t);
    } else {
        printf("\nother %s\n", t);
    }
}

