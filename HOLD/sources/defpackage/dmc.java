package defpackage;

/* renamed from: dmc  reason: default package */
/* compiled from: PG */
public enum dmc {
    DOUBLE(dmd.DOUBLE),
    FLOAT(dmd.FLOAT),
    INT64(dmd.LONG),
    UINT64(dmd.LONG),
    INT32(dmd.INT),
    FIXED64(dmd.LONG),
    FIXED32(dmd.INT),
    BOOL(dmd.BOOLEAN),
    STRING(dmd.STRING),
    GROUP(dmd.MESSAGE),
    MESSAGE(dmd.MESSAGE),
    BYTES(dmd.BYTE_STRING),
    UINT32(dmd.INT),
    ENUM(dmd.ENUM),
    SFIXED32(dmd.INT),
    SFIXED64(dmd.LONG),
    SINT32(dmd.INT),
    SINT64(dmd.LONG);
    
    public final dmd c;

    private dmc(dmd dmd) {
        this.c = dmd;
    }
}
