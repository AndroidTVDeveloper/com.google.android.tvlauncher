package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: up  reason: default package */
/* compiled from: PG */
public final class up implements ug {
    private final zv a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public up(zv zvVar, int i) {
        this.a = zvVar;
        this.b = i;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final int d() {
        return 2;
    }

    public final void c() {
        this.e = true;
    }

    public final void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    public final void a(sm smVar, uf ufVar) {
        ahy.a();
        try {
            zv zvVar = this.a;
            if (zvVar.f == null) {
                if (TextUtils.isEmpty(zvVar.e)) {
                    String str = zvVar.d;
                    if (TextUtils.isEmpty(str)) {
                        str = ((URL) aic.a(zvVar.c)).toString();
                    }
                    zvVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                zvVar.f = new URL(zvVar.e);
            }
            ufVar.a(a(zvVar.f, 0, null, this.a.b.a()));
        } catch (IOException e2) {
            ufVar.a((Exception) e2);
        }
    }

    private final InputStream a(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new tq("In re-direct loop");
                    }
                } catch (URISyntaxException e2) {
                }
            }
            this.c = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                this.c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.c.setConnectTimeout(this.b);
            this.c.setReadTimeout(this.b);
            this.c.setUseCaches(false);
            this.c.setDoInput(true);
            this.c.setInstanceFollowRedirects(false);
            this.c.connect();
            this.d = this.c.getInputStream();
            if (this.e) {
                return null;
            }
            int responseCode = this.c.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.c;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.d = new aht(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    this.d = httpURLConnection.getInputStream();
                }
                return this.d;
            } else if (i2 == 3) {
                String headerField = this.c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return a(url3, i + 1, url, map);
                }
                throw new tq("Received empty or null redirect url");
            } else if (responseCode != -1) {
                throw new tq(this.c.getResponseMessage(), (byte) 0);
            } else {
                throw new tq();
            }
        } else {
            throw new tq("Too many (> 5) redirects!");
        }
    }
}
