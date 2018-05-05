package xiaoanjie;

public interface Match {
 Pattern getPattern();
 TypedNode getMatch(PatternNode node);
 TypeEdge getMatch(PatternEdge edge);
}
