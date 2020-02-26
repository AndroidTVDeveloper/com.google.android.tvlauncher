package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: big  reason: default package */
/* compiled from: PG */
public final class big extends bho implements bio {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference b = new AtomicReference();
    private final String c;
    private final bin d;
    private final bin e = new bin();
    private HttpURLConnection f;
    private InputStream g;
    private boolean h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;

    public big(String str, bin bin) {
        super(true);
        this.c = bks.a(str);
        this.d = bin;
    }

    public final void c() {
        try {
            if (this.g != null) {
                HttpURLConnection httpURLConnection = this.f;
                long j2 = this.k;
                if (j2 != -1) {
                    j2 -= this.m;
                }
                if (blm.a == 19 || blm.a == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j2 != -1) {
                            if (j2 > 2048) {
                            }
                        } else if (inputStream.read() == -1) {
                        }
                        String name = inputStream.getClass().getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception e2) {
                    }
                }
                this.g.close();
            }
            this.g = null;
            f();
            if (this.h) {
                this.h = false;
                d();
            }
        } catch (IOException e3) {
            throw new bil(e3);
        } catch (Throwable th) {
            this.g = null;
            f();
            if (this.h) {
                this.h = false;
                d();
            }
            throw th;
        }
    }

    private final void f() {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f = null;
        }
    }

    public final Map b() {
        HttpURLConnection httpURLConnection = this.f;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
        if (r9 != -1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        if (r3 == 0) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bhy r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r3 = "Unable to connect to "
            r4 = 0
            r1.m = r4
            r1.l = r4
            r22.e()
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x027d }
            android.net.Uri r6 = r2.a     // Catch:{ IOException -> 0x027d }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x027d }
            r0.<init>(r6)     // Catch:{ IOException -> 0x027d }
            int r6 = r2.b     // Catch:{ IOException -> 0x027d }
            long r7 = r2.e     // Catch:{ IOException -> 0x027d }
            long r9 = r2.f     // Catch:{ IOException -> 0x027d }
            r11 = 1
            boolean r12 = r2.a(r11)     // Catch:{ IOException -> 0x027d }
            java.util.Map r13 = r2.c     // Catch:{ IOException -> 0x027d }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x027d }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x027d }
            r14 = 8000(0x1f40, float:1.121E-41)
            r0.setConnectTimeout(r14)     // Catch:{ IOException -> 0x027d }
            r0.setReadTimeout(r14)     // Catch:{ IOException -> 0x027d }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ IOException -> 0x027d }
            r14.<init>()     // Catch:{ IOException -> 0x027d }
            bin r15 = r1.d     // Catch:{ IOException -> 0x027d }
            java.util.Map r15 = r15.a()     // Catch:{ IOException -> 0x027d }
            r14.putAll(r15)     // Catch:{ IOException -> 0x027d }
            bin r15 = r1.e     // Catch:{ IOException -> 0x027d }
            java.util.Map r15 = r15.a()     // Catch:{ IOException -> 0x027d }
            r14.putAll(r15)     // Catch:{ IOException -> 0x027d }
            r14.putAll(r13)     // Catch:{ IOException -> 0x027d }
            java.util.Set r13 = r14.entrySet()     // Catch:{ IOException -> 0x027d }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x027d }
        L_0x0057:
            boolean r14 = r13.hasNext()     // Catch:{ IOException -> 0x027d }
            if (r14 == 0) goto L_0x0073
            java.lang.Object r14 = r13.next()     // Catch:{ IOException -> 0x027d }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ IOException -> 0x027d }
            java.lang.Object r15 = r14.getKey()     // Catch:{ IOException -> 0x027d }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x027d }
            java.lang.Object r14 = r14.getValue()     // Catch:{ IOException -> 0x027d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x027d }
            r0.setRequestProperty(r15, r14)     // Catch:{ IOException -> 0x027d }
            goto L_0x0057
        L_0x0073:
            r13 = 27
            r14 = -1
            int r16 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00bf
        L_0x0080:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d }
            r4.<init>(r13)     // Catch:{ IOException -> 0x027d }
            java.lang.String r5 = "bytes="
            r4.append(r5)     // Catch:{ IOException -> 0x027d }
            r4.append(r7)     // Catch:{ IOException -> 0x027d }
            java.lang.String r5 = "-"
            r4.append(r5)     // Catch:{ IOException -> 0x027d }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x027d }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x009b
            goto L_0x00ba
        L_0x009b:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x027d }
            long r7 = r7 + r9
            long r7 = r7 + r14
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x027d }
            int r5 = r5.length()     // Catch:{ IOException -> 0x027d }
            int r5 = r5 + 20
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d }
            r9.<init>(r5)     // Catch:{ IOException -> 0x027d }
            r9.append(r4)     // Catch:{ IOException -> 0x027d }
            r9.append(r7)     // Catch:{ IOException -> 0x027d }
            java.lang.String r4 = r9.toString()     // Catch:{ IOException -> 0x027d }
        L_0x00ba:
            java.lang.String r5 = "Range"
            r0.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x027d }
        L_0x00bf:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.c     // Catch:{ IOException -> 0x027d }
            r0.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x027d }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "gzip"
            if (r12 != 0) goto L_0x00cf
            java.lang.String r7 = "identity"
            goto L_0x00d1
        L_0x00cf:
            r7 = r5
        L_0x00d1:
            r0.setRequestProperty(r4, r7)     // Catch:{ IOException -> 0x027d }
            r0.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x027d }
            r4 = 0
            r0.setDoOutput(r4)     // Catch:{ IOException -> 0x027d }
            java.lang.String r4 = defpackage.bhy.b(r6)     // Catch:{ IOException -> 0x027d }
            r0.setRequestMethod(r4)     // Catch:{ IOException -> 0x027d }
            r0.connect()     // Catch:{ IOException -> 0x027d }
            r1.f = r0     // Catch:{ IOException -> 0x027d }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x0259 }
            r1.i = r0     // Catch:{ IOException -> 0x0259 }
            java.net.HttpURLConnection r0 = r1.f     // Catch:{ IOException -> 0x0259 }
            r0.getResponseMessage()     // Catch:{ IOException -> 0x0259 }
            int r0 = r1.i
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 >= r3) goto L_0x00fa
            goto L_0x023b
        L_0x00fa:
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 > r4) goto L_0x023b
            java.net.HttpURLConnection r0 = r1.f
            r0.getContentType()
            int r0 = r1.i
            if (r0 != r3) goto L_0x010f
            long r3 = r2.e
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0111
        L_0x010f:
            r3 = 0
        L_0x0111:
            r1.j = r3
            java.net.HttpURLConnection r0 = r1.f
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = r5.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0127
            long r4 = r2.f
            r1.k = r4
            goto L_0x0214
        L_0x0127:
            long r4 = r2.f
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0212
            java.net.HttpURLConnection r4 = r1.f
            java.lang.String r0 = "Content-Length"
            java.lang.String r5 = r4.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = "DefaultHttpDataSource"
            java.lang.String r7 = "]"
            if (r0 != 0) goto L_0x0169
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0144 }
            goto L_0x016b
        L_0x0144:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r0 = r0 + 28
            r8.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Length ["
            r8.append(r0)
            r8.append(r5)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            android.util.Log.e(r6, r0)
            r8 = r14
            goto L_0x016b
        L_0x0169:
            r8 = r14
        L_0x016b:
            java.lang.String r0 = "Content-Range"
            java.lang.String r4 = r4.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x01e0
            java.util.regex.Pattern r0 = defpackage.big.a
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r10 = r0.find()
            if (r10 == 0) goto L_0x01e0
            r10 = 2
            java.lang.String r10 = r0.group(r10)     // Catch:{ NumberFormatException -> 0x01e1 }
            long r18 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x01e1 }
            java.lang.String r0 = r0.group(r11)     // Catch:{ NumberFormatException -> 0x01e1 }
            long r20 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01e1 }
            long r18 = r18 - r20
            r20 = 1
            long r11 = r18 + r20
            r16 = 0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01df
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ NumberFormatException -> 0x01e1 }
            int r0 = r0.length()     // Catch:{ NumberFormatException -> 0x01e1 }
            int r0 = r0 + 26
            java.lang.String r16 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x01e1 }
            int r16 = r16.length()     // Catch:{ NumberFormatException -> 0x01e1 }
            int r0 = r0 + r16
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01e1 }
            r10.<init>(r0)     // Catch:{ NumberFormatException -> 0x01e1 }
            java.lang.String r0 = "Inconsistent headers ["
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01e1 }
            r10.append(r5)     // Catch:{ NumberFormatException -> 0x01e1 }
            java.lang.String r0 = "] ["
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01e1 }
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x01e1 }
            r10.append(r7)     // Catch:{ NumberFormatException -> 0x01e1 }
            java.lang.String r0 = r10.toString()     // Catch:{ NumberFormatException -> 0x01e1 }
            android.util.Log.w(r6, r0)     // Catch:{ NumberFormatException -> 0x01e1 }
            long r4 = java.lang.Math.max(r8, r11)     // Catch:{ NumberFormatException -> 0x01e1 }
            r8 = r4
            goto L_0x01e0
        L_0x01de:
            goto L_0x01e0
        L_0x01df:
            r8 = r11
        L_0x01e0:
            goto L_0x0204
        L_0x01e1:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r0 = r0 + r13
            r5.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r5.append(r0)
            r5.append(r4)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r6, r0)
        L_0x0204:
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x020d
            long r4 = r1.j
            long r14 = r8 - r4
            goto L_0x020f
        L_0x020d:
        L_0x020f:
            r1.k = r14
            goto L_0x0214
        L_0x0212:
            r1.k = r4
        L_0x0214:
            java.net.HttpURLConnection r0 = r1.f     // Catch:{ IOException -> 0x0231 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0231 }
            r1.g = r0     // Catch:{ IOException -> 0x0231 }
            if (r3 == 0) goto L_0x0227
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0231 }
            java.io.InputStream r3 = r1.g     // Catch:{ IOException -> 0x0231 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0231 }
            r1.g = r0     // Catch:{ IOException -> 0x0231 }
        L_0x0227:
            r3 = 1
            r1.h = r3
            r22.b(r23)
            long r2 = r1.k
            return r2
        L_0x0231:
            r0 = move-exception
            r22.f()
            bil r2 = new bil
            r2.<init>(r0)
            throw r2
        L_0x023b:
            java.net.HttpURLConnection r0 = r1.f
            r0.getHeaderFields()
            r22.f()
            bim r0 = new bim
            int r2 = r1.i
            r0.<init>(r2)
            int r2 = r1.i
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x0258
            bhw r2 = new bhw
            r2.<init>()
            r0.initCause(r2)
        L_0x0258:
            throw r0
        L_0x0259:
            r0 = move-exception
            r22.f()
            bil r4 = new bil
            android.net.Uri r2 = r2.a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0275
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0279
        L_0x0275:
            java.lang.String r2 = r3.concat(r2)
        L_0x0279:
            r4.<init>(r2, r0)
            throw r4
        L_0x027d:
            r0 = move-exception
            bil r4 = new bil
            android.net.Uri r2 = r2.a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0296
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x029a
        L_0x0296:
            java.lang.String r2 = r3.concat(r2)
        L_0x029a:
            r4.<init>(r2, r0)
            goto L_0x029f
        L_0x029e:
            throw r4
        L_0x029f:
            goto L_0x029e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.big.a(bhy):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[Catch:{ IOException -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            long r0 = r8.l     // Catch:{ IOException -> 0x0096 }
            long r2 = r8.j     // Catch:{ IOException -> 0x0096 }
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.big.b     // Catch:{ IOException -> 0x0096 }
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch:{ IOException -> 0x0096 }
            byte[] r0 = (byte[]) r0     // Catch:{ IOException -> 0x0096 }
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            goto L_0x001a
        L_0x0016:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0096 }
        L_0x001a:
            long r1 = r8.l     // Catch:{ IOException -> 0x0096 }
            long r6 = r8.j     // Catch:{ IOException -> 0x0096 }
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.big.b     // Catch:{ IOException -> 0x0096 }
            r1.set(r0)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0058
        L_0x0028:
            long r6 = r6 - r1
            int r1 = r0.length     // Catch:{ IOException -> 0x0096 }
            long r1 = (long) r1     // Catch:{ IOException -> 0x0096 }
            long r1 = java.lang.Math.min(r6, r1)     // Catch:{ IOException -> 0x0096 }
            int r2 = (int) r1     // Catch:{ IOException -> 0x0096 }
            java.io.InputStream r1 = r8.g     // Catch:{ IOException -> 0x0096 }
            int r1 = r1.read(r0, r4, r2)     // Catch:{ IOException -> 0x0096 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0096 }
            boolean r2 = r2.isInterrupted()     // Catch:{ IOException -> 0x0096 }
            if (r2 != 0) goto L_0x0052
            if (r1 == r5) goto L_0x004c
            long r2 = r8.l     // Catch:{ IOException -> 0x0096 }
            long r6 = (long) r1     // Catch:{ IOException -> 0x0096 }
            long r2 = r2 + r6
            r8.l = r2     // Catch:{ IOException -> 0x0096 }
            r8.a(r1)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0015
        L_0x004c:
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ IOException -> 0x0096 }
            r9.<init>()     // Catch:{ IOException -> 0x0096 }
            throw r9     // Catch:{ IOException -> 0x0096 }
        L_0x0052:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0096 }
            r9.<init>()     // Catch:{ IOException -> 0x0096 }
            throw r9     // Catch:{ IOException -> 0x0096 }
        L_0x0058:
            if (r11 == 0) goto L_0x0094
            long r0 = r8.k     // Catch:{ IOException -> 0x0096 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0063
            goto L_0x0072
        L_0x0063:
            long r6 = r8.m     // Catch:{ IOException -> 0x0096 }
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            long r6 = (long) r11     // Catch:{ IOException -> 0x0096 }
            long r0 = java.lang.Math.min(r6, r0)     // Catch:{ IOException -> 0x0096 }
            int r11 = (int) r0     // Catch:{ IOException -> 0x0096 }
        L_0x0072:
            java.io.InputStream r0 = r8.g     // Catch:{ IOException -> 0x0096 }
            int r4 = r0.read(r9, r10, r11)     // Catch:{ IOException -> 0x0096 }
            if (r4 == r5) goto L_0x0084
            long r9 = r8.m     // Catch:{ IOException -> 0x0096 }
            long r0 = (long) r4     // Catch:{ IOException -> 0x0096 }
            long r9 = r9 + r0
            r8.m = r9     // Catch:{ IOException -> 0x0096 }
            r8.a(r4)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0094
        L_0x0084:
            long r9 = r8.k     // Catch:{ IOException -> 0x0096 }
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ IOException -> 0x0096 }
            r9.<init>()     // Catch:{ IOException -> 0x0096 }
            throw r9     // Catch:{ IOException -> 0x0096 }
        L_0x0091:
        L_0x0092:
            r4 = -1
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            return r4
        L_0x0096:
            r9 = move-exception
            bil r10 = new bil
            r10.<init>(r9)
            goto L_0x009e
        L_0x009d:
            throw r10
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.big.a(byte[], int, int):int");
    }
}
