%{
char name[10];
%}

%%
\n {printf("\n Hi ... %s ... good work \n", name); return 1; }
%%


void main() {
    char opt;
    do {
        printf("\nwhat is your name : ");
        scanf("%s", name);
        yylex();
        printf("\npress y to continue : ");
        scanf("%c", &opt);
    } while(opt == 'y');
}

