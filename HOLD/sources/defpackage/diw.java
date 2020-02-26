package defpackage;

/* renamed from: diw  reason: default package */
/* compiled from: PG */
public enum diw {
    DOUBLE(0, 1, djo.DOUBLE),
    FLOAT(1, 1, djo.FLOAT),
    INT64(2, 1, djo.LONG),
    UINT64(3, 1, djo.LONG),
    INT32(4, 1, djo.INT),
    FIXED64(5, 1, djo.LONG),
    FIXED32(6, 1, djo.INT),
    BOOL(7, 1, djo.BOOLEAN),
    STRING(8, 1, djo.STRING),
    MESSAGE(9, 1, djo.MESSAGE),
    BYTES(10, 1, djo.BYTE_STRING),
    UINT32(11, 1, djo.INT),
    ENUM(12, 1, djo.ENUM),
    SFIXED32(13, 1, djo.INT),
    SFIXED64(14, 1, djo.LONG),
    SINT32(15, 1, djo.INT),
    SINT64(16, 1, djo.LONG),
    GROUP(17, 1, djo.MESSAGE),
    DOUBLE_LIST(18, 2, djo.DOUBLE),
    FLOAT_LIST(19, 2, djo.FLOAT),
    INT64_LIST(20, 2, djo.LONG),
    UINT64_LIST(21, 2, djo.LONG),
    INT32_LIST(22, 2, djo.INT),
    FIXED64_LIST(23, 2, djo.LONG),
    FIXED32_LIST(24, 2, djo.INT),
    BOOL_LIST(25, 2, djo.BOOLEAN),
    STRING_LIST(26, 2, djo.STRING),
    MESSAGE_LIST(27, 2, djo.MESSAGE),
    BYTES_LIST(28, 2, djo.BYTE_STRING),
    UINT32_LIST(29, 2, djo.INT),
    ENUM_LIST(30, 2, djo.ENUM),
    SFIXED32_LIST(31, 2, djo.INT),
    SFIXED64_LIST(32, 2, djo.LONG),
    SINT32_LIST(33, 2, djo.INT),
    SINT64_LIST(34, 2, djo.LONG),
    DOUBLE_LIST_PACKED(35, 3, djo.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, djo.FLOAT),
    INT64_LIST_PACKED(37, 3, djo.LONG),
    UINT64_LIST_PACKED(38, 3, djo.LONG),
    INT32_LIST_PACKED(39, 3, djo.INT),
    FIXED64_LIST_PACKED(40, 3, djo.LONG),
    FIXED32_LIST_PACKED(41, 3, djo.INT),
    BOOL_LIST_PACKED(42, 3, djo.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, djo.INT),
    ENUM_LIST_PACKED(44, 3, djo.ENUM),
    SFIXED32_LIST_PACKED(45, 3, djo.INT),
    SFIXED64_LIST_PACKED(46, 3, djo.LONG),
    SINT32_LIST_PACKED(47, 3, djo.INT),
    SINT64_LIST_PACKED(48, 3, djo.LONG),
    GROUP_LIST(49, 2, djo.MESSAGE),
    MAP(50, 4, djo.VOID);
    
    private static final diw[] aa;
    public final int c;

    static {
        aa = new diw[r1];
        for (diw diw : values()) {
            aa[diw.c] = diw;
        }
    }

    private diw(int i, int i2, djo djo) {
        this.c = i;
        djo djo2 = djo.VOID;
        if (i2 == 1) {
            djo.ordinal();
        }
    }
}
