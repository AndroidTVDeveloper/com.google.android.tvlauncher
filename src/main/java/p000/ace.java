package p000;

/* renamed from: ace */
/* compiled from: PG */
public final class ace implements C0543ua {

    /* renamed from: a */
    private static final C0538tw f86a = C0538tw.m8390a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    private static final C0538tw f87b = new C0538tw("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0538tw.f10523a);

    /* renamed from: c */
    private final C0628xe f88c;

    /* renamed from: a */
    public final int mo40a() {
        return 2;
    }

    @Deprecated
    public ace() {
        this.f88c = null;
    }

    public ace(C0628xe xeVar) {
        this.f88c = xeVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC, Splitter:B:32:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b A[SYNTHETIC, Splitter:B:39:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean mo29a(java.lang.Object r6, java.io.File r7, p000.C0539tx r8) {
        /*
            r5 = this;
            ww r6 = (p000.C0619ww) r6
            java.lang.Object r6 = r6.mo33b()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            tw r0 = p000.ace.f87b
            java.lang.Object r0 = r8.mo5987a(r0)
            android.graphics.Bitmap$CompressFormat r0 = (android.graphics.Bitmap.CompressFormat) r0
            if (r0 != 0) goto L_0x001d
            boolean r0 = r6.hasAlpha()
            if (r0 == 0) goto L_0x001b
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x001d
        L_0x001b:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x001d:
            r6.getWidth()
            r6.getHeight()
            p000.ahy.m529a()     // Catch:{ all -> 0x0074 }
            tw r1 = p000.ace.f86a     // Catch:{ all -> 0x0074 }
            java.lang.Object r8 = r8.mo5987a(r1)     // Catch:{ all -> 0x0074 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0074 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0074 }
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0068, all -> 0x005f }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0068, all -> 0x005f }
            xe r7 = r5.f88c     // Catch:{ IOException -> 0x005c, all -> 0x0058 }
            if (r7 == 0) goto L_0x0044
            ue r2 = new ue     // Catch:{ IOException -> 0x005c, all -> 0x0058 }
            r2.<init>(r4, r7)     // Catch:{ IOException -> 0x005c, all -> 0x0058 }
            goto L_0x0045
        L_0x0044:
            r2 = r4
        L_0x0045:
            r6.compress(r0, r8, r2)     // Catch:{ IOException -> 0x0056, all -> 0x0053 }
            r2.close()     // Catch:{ IOException -> 0x0056, all -> 0x0053 }
            r2.close()     // Catch:{ IOException -> 0x0050 }
            r3 = 1
            goto L_0x0073
        L_0x0050:
            r6 = move-exception
            r3 = 1
            goto L_0x0073
        L_0x0053:
            r6 = move-exception
            goto L_0x0060
        L_0x0056:
            r6 = move-exception
            goto L_0x0069
        L_0x0058:
            r6 = move-exception
            r2 = r4
            goto L_0x0060
        L_0x005c:
            r6 = move-exception
            r2 = r4
            goto L_0x0069
        L_0x005f:
            r6 = move-exception
        L_0x0060:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            throw r6     // Catch:{ all -> 0x0074 }
        L_0x0068:
            r6 = move-exception
        L_0x0069:
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0072
        L_0x006f:
            r6 = move-exception
            goto L_0x0073
        L_0x0071:
        L_0x0072:
        L_0x0073:
            return r3
        L_0x0074:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ace.mo29a(java.lang.Object, java.io.File, tx):boolean");
    }
}
