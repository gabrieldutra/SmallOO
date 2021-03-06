package lexical;

import java.util.HashMap;
import java.util.Map;

class SymbolTable {

    private Map<String, TokenType> st;

    public SymbolTable() {
        st = new HashMap<String, TokenType>();

        // symbols
        st.put(";", TokenType.DOT_COMMA);
        st.put(",", TokenType.COMMA);
        st.put("{", TokenType.OPEN_CUR);
        st.put("}", TokenType.CLOSE_CUR);
        st.put("(", TokenType.OPEN_PAR);
        st.put(")", TokenType.CLOSE_PAR);

        // keywords
        st.put("if", TokenType.IF);
        st.put("else", TokenType.ELSE);
        st.put("while", TokenType.WHILE);
        st.put("function", TokenType.FUNCTION);
        st.put("return", TokenType.RETURN);
        st.put("system", TokenType.SYSTEM);
        st.put("self", TokenType.SELF);
        st.put("args", TokenType.ARGS);

        // operators
        st.put(".", TokenType.DOT);
        st.put("=", TokenType.ATTRIB);
        st.put("+", TokenType.PLUS);
        st.put("-", TokenType.MINUS);
        st.put("*", TokenType.MULT);
        st.put("/", TokenType.DIV);
        st.put("%", TokenType.MOD);
        st.put("<", TokenType.LESS);
        st.put(">", TokenType.GREATER);
        st.put("==", TokenType.EQUAL);
        st.put("<=", TokenType.LESS_EQ);
        st.put(">=", TokenType.GREATER_EQ);
        st.put("!=", TokenType.NOT_EQ);
        st.put("!", TokenType.NOT);
        st.put("&", TokenType.AND);
        st.put("|", TokenType.OR);
    }

    public boolean contains(String token) {
        return st.containsKey(token);
    }

    public TokenType find(String token) {
        return this.contains(token) ?
                st.get(token) : TokenType.INVALID_TOKEN;
    }
}
