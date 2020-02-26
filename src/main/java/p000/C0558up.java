package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: up */
/* compiled from: PG */
public final class C0558up implements C0549ug {

    /* renamed from: a */
    private final C0699zv f10545a;

    /* renamed from: b */
    private final int f10546b;

    /* renamed from: c */
    private HttpURLConnection f10547c;

    /* renamed from: d */
    private InputStream f10548d;

    /* renamed from: e */
    private volatile boolean f10549e;

    public C0558up(C0699zv zvVar, int i) {
        this.f10545a = zvVar;
        this.f10546b = i;
    }

    /* renamed from: a */
    public final Class mo6a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final int mo10d() {
        return 2;
    }

    /* renamed from: c */
    public final void mo9c() {
        this.f10549e = true;
    }

    /* renamed from: b */
    public final void mo8b() {
        InputStream inputStream = this.f10548d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10547c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10547c = null;
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        ahy.m529a();
        try {
            C0699zv zvVar = this.f10545a;
            if (zvVar.f10865f == null) {
                if (TextUtils.isEmpty(zvVar.f10864e)) {
                    String str = zvVar.f10863d;
                    if (TextUtils.isEmpty(str)) {
                        str = ((URL) aic.m542a(zvVar.f10862c)).toString();
                    }
                    zvVar.f10864e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                zvVar.f10865f = new URL(zvVar.f10864e);
            }
            ufVar.mo22a(m8435a(zvVar.f10865f, 0, null, this.f10545a.f10861b.mo1a()));
        } catch (IOException e) {
            ufVar.mo21a((Exception) e);
        }
    }

    /* renamed from: a */
    private final InputStream m8435a(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C0532tq("In re-direct loop");
                    }
                } catch (URISyntaxException e) {
                }
            }
            this.f10547c = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                this.f10547c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f10547c.setConnectTimeout(this.f10546b);
            this.f10547c.setReadTimeout(this.f10546b);
            this.f10547c.setUseCaches(false);
            this.f10547c.setDoInput(true);
            this.f10547c.setInstanceFollowRedirects(false);
            this.f10547c.connect();
            this.f10548d = this.f10547c.getInputStream();
            if (this.f10549e) {
                return null;
            }
            int responseCode = this.f10547c.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.f10547c;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f10548d = new aht(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    this.f10548d = httpURLConnection.getInputStream();
                }
                return this.f10548d;
            } else if (i2 == 3) {
                String headerField = this.f10547c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo8b();
                    return m8435a(url3, i + 1, url, map);
                }
                throw new C0532tq("Received empty or null redirect url");
            } else if (responseCode != -1) {
                throw new C0532tq(this.f10547c.getResponseMessage(), (byte) 0);
            } else {
                throw new C0532tq();
            }
        } else {
            throw new C0532tq("Too many (> 5) redirects!");
        }
    }
}
