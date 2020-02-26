package defpackage;

import java.io.IOException;

/* renamed from: dim  reason: default package */
/* compiled from: PG */
public final class dim extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    dim() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dim(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 != 0) goto L_0x0012
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            goto L_0x0016
        L_0x0012:
            java.lang.String r3 = r1.concat(r3)
        L_0x0016:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dim.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public dim(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
