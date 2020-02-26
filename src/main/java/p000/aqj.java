package p000;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: aqj */
/* compiled from: PG */
final class aqj {

    /* renamed from: a */
    private static final String[] f1838a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static akh m1808a(int i, akh akh, atw atw, atw atw2, aom aom) {
        if (i == 1) {
            if (aom.mo1214a()) {
                akh = akh.mo420a(aom.f1497a, aom.f1498b);
            }
            return atw != null ? akh.mo425a(atw) : akh;
        } else if (i != 2 || atw2 == null) {
            return akh;
        } else {
            akh akh2 = akh;
            for (int i2 = 0; i2 < atw2.mo1344a(); i2++) {
                atv a = atw2.mo1345a(i2);
                if (a instanceof aqi) {
                    aqi aqi = (aqi) a;
                    if ("com.android.capture.fps".equals(aqi.f1834a) && aqi.f1836c == 23) {
                        try {
                            akh2 = akh2.mo419a(ByteBuffer.wrap(aqi.f1835b).asFloatBuffer().get());
                            try {
                                akh2 = akh2.mo425a(new atw(aqi));
                            } catch (NumberFormatException e) {
                                Log.w("MetadataUtil", "Ignoring invalid framerate");
                            }
                        } catch (NumberFormatException e2) {
                            Log.w("MetadataUtil", "Ignoring invalid framerate");
                        }
                    }
                }
            }
            return akh2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqj.a(int, java.lang.String, bky, boolean, boolean):avc
     arg types: [int, java.lang.String, bky, int, int]
     candidates:
      aqj.a(int, akh, atw, atw, aom):akh
      aqj.a(int, java.lang.String, bky, boolean, boolean):avc */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028a A[Catch:{ all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x028f A[Catch:{ all -> 0x020e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.atv m1810a(p000.bky r12) {
        /*
            int r0 = r12.f4259b
            int r1 = r12.mo2083j()
            int r0 = r0 + r1
            int r1 = r12.mo2083j()
            int r2 = r1 >>> 24
            java.lang.String r3 = "TCON"
            java.lang.String r4 = "MetadataUtil"
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 != r7) goto L_0x001b
            goto L_0x01c7
        L_0x001b:
            r7 = 253(0xfd, float:3.55E-43)
            if (r2 == r7) goto L_0x01c7
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r7 = -1
            if (r1 != r2) goto L_0x004c
            int r1 = m1813b(r12)     // Catch:{ all -> 0x020e }
            if (r1 <= 0) goto L_0x0037
            java.lang.String[] r2 = p000.aqj.f1838a     // Catch:{ all -> 0x020e }
            int r2 = r2.length     // Catch:{ all -> 0x020e }
            if (r1 > r2) goto L_0x0036
            java.lang.String[] r2 = p000.aqj.f1838a     // Catch:{ all -> 0x020e }
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x020e }
            goto L_0x0038
        L_0x0036:
        L_0x0037:
            r1 = r6
        L_0x0038:
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x020e }
            r2 = r6
            goto L_0x0048
        L_0x0041:
            avk r2 = new avk     // Catch:{ all -> 0x020e }
            r2.<init>(r3, r6, r1)     // Catch:{ all -> 0x020e }
        L_0x0048:
            r12.mo2073c(r0)
            return r2
        L_0x004c:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = "TPOS"
            avk r1 = m1814b(r2, r1, r12)     // Catch:{ all -> 0x020e }
        L_0x0058:
            r12.mo2073c(r0)
            return r1
        L_0x005c:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r1 != r2) goto L_0x0068
            java.lang.String r1 = "TRCK"
            avk r1 = m1814b(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0068:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0076
            java.lang.String r1 = "TBPM"
            avc r1 = m1811a(r2, r1, r12, r3, r8)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0076:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r1 != r2) goto L_0x0082
            java.lang.String r1 = "TCMP"
            avc r1 = m1811a(r2, r1, r12, r3, r3)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0082:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r1 != r2) goto L_0x00df
            int r1 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            int r2 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            if (r2 == r5) goto L_0x0097
            java.lang.String r1 = "Failed to parse cover art attribute"
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x0097:
            int r2 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            int r2 = p000.apu.m1768d(r2)     // Catch:{ all -> 0x020e }
            r3 = 13
            if (r2 != r3) goto L_0x00a6
            java.lang.String r3 = "image/jpeg"
            goto L_0x00ae
        L_0x00a6:
            r3 = 14
            if (r2 != r3) goto L_0x00ad
            java.lang.String r3 = "image/png"
            goto L_0x00ae
        L_0x00ad:
            r3 = r6
        L_0x00ae:
            if (r3 != 0) goto L_0x00c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r3 = 41
            r1.<init>(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020e }
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x00c8:
            r2 = 4
            r12.mo2075d(r2)     // Catch:{ all -> 0x020e }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x020e }
            r12.mo2069a(r2, r8, r1)     // Catch:{ all -> 0x020e }
            aup r1 = new aup     // Catch:{ all -> 0x020e }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x020e }
            r6 = r1
        L_0x00db:
            r12.mo2073c(r0)
            return r6
        L_0x00df:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r1 != r2) goto L_0x00ed
            java.lang.String r1 = "TPE2"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x00ed:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r1 != r2) goto L_0x00fa
            java.lang.String r1 = "TSOT"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x00fa:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r1 != r2) goto L_0x0107
            java.lang.String r1 = "TSO2"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0107:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r1 != r2) goto L_0x0114
            java.lang.String r1 = "TSOA"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0114:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r1 != r2) goto L_0x0121
            java.lang.String r1 = "TSOP"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0121:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r1 != r2) goto L_0x012e
            java.lang.String r1 = "TSOC"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x012e:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r1 != r2) goto L_0x013b
            java.lang.String r1 = "ITUNESADVISORY"
            avc r1 = m1811a(r2, r1, r12, r8, r8)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x013b:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r1 != r2) goto L_0x0148
            java.lang.String r1 = "ITUNESGAPLESS"
            avc r1 = m1811a(r2, r1, r12, r8, r3)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0148:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r1 != r2) goto L_0x0155
            java.lang.String r1 = "TVSHOWSORT"
            avk r1 = m1812a(r2, r1, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0155:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r1 != r2) goto L_0x0165
            r1 = 1953919848(0x74767368, float:7.810338E31)
            java.lang.String r2 = "TVSHOW"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0165:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r1 != r2) goto L_0x027a
            r1 = r6
            r2 = r1
            r3 = -1
            r4 = -1
        L_0x016e:
            int r8 = r12.f4259b     // Catch:{ all -> 0x020e }
            if (r8 >= r0) goto L_0x01a7
            int r9 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            int r10 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            r11 = 4
            r12.mo2075d(r11)     // Catch:{ all -> 0x020e }
            r11 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r10 != r11) goto L_0x018a
            int r9 = r9 + -12
            java.lang.String r1 = r12.mo2079f(r9)     // Catch:{ all -> 0x020e }
            goto L_0x01a5
        L_0x018a:
            r11 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r10 != r11) goto L_0x0197
            int r9 = r9 + -12
            java.lang.String r2 = r12.mo2079f(r9)     // Catch:{ all -> 0x020e }
            goto L_0x01a5
        L_0x0197:
            if (r10 == r5) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r4 = r9
        L_0x019b:
            if (r10 != r5) goto L_0x019e
            r3 = r8
        L_0x019e:
            int r9 = r9 + -12
            r12.mo2075d(r9)     // Catch:{ all -> 0x020e }
        L_0x01a5:
            goto L_0x016e
        L_0x01a7:
            if (r1 != 0) goto L_0x01ab
        L_0x01a9:
            goto L_0x00db
        L_0x01ab:
            if (r2 == 0) goto L_0x01c6
            if (r3 != r7) goto L_0x01b0
            goto L_0x01a9
        L_0x01b0:
            r12.mo2073c(r3)     // Catch:{ all -> 0x020e }
            r3 = 16
            r12.mo2075d(r3)     // Catch:{ all -> 0x020e }
            int r4 = r4 + -16
            java.lang.String r3 = r12.mo2079f(r4)     // Catch:{ all -> 0x020e }
            ave r6 = new ave     // Catch:{ all -> 0x020e }
            r6.<init>(r1, r2, r3)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x01c6:
            goto L_0x01a9
        L_0x01c7:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            r7 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r7) goto L_0x0211
            int r2 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            int r3 = r12.mo2083j()     // Catch:{ all -> 0x020e }
            if (r3 == r5) goto L_0x01f9
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = p000.apu.m1769e(r1)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x020e }
            int r3 = r1.length()     // Catch:{ all -> 0x020e }
            if (r3 != 0) goto L_0x01f0
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x020e }
            r1.<init>(r2)     // Catch:{ all -> 0x020e }
            goto L_0x01f4
        L_0x01f0:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x020e }
        L_0x01f4:
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x01f9:
            r1 = 8
            r12.mo2075d(r1)     // Catch:{ all -> 0x020e }
            int r2 = r2 + -16
            java.lang.String r1 = r12.mo2079f(r2)     // Catch:{ all -> 0x020e }
            aux r6 = new aux     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "und"
            r6.<init>(r2, r1, r1)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x020e:
            r1 = move-exception
            goto L_0x02ae
        L_0x0211:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 != r4) goto L_0x0218
            goto L_0x02a6
        L_0x0218:
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 == r4) goto L_0x02a6
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 != r4) goto L_0x0224
        L_0x0222:
            goto L_0x029e
        L_0x0224:
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 == r4) goto L_0x0222
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r4) goto L_0x0236
            java.lang.String r2 = "TDRC"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0236:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r4) goto L_0x0243
            java.lang.String r2 = "TPE1"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0243:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r4) goto L_0x0250
            java.lang.String r2 = "TSSE"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0250:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r4) goto L_0x025d
            java.lang.String r2 = "TALB"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x025d:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r4) goto L_0x026a
            java.lang.String r2 = "USLT"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x026a:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r4) goto L_0x0275
            avk r1 = m1812a(r1, r3, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x0275:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 == r3) goto L_0x0296
        L_0x027a:
            java.lang.String r2 = "Skipped unknown metadata entry: "
            java.lang.String r1 = p000.apu.m1769e(r1)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x020e }
            int r3 = r1.length()     // Catch:{ all -> 0x020e }
            if (r3 == 0) goto L_0x028f
            r2.concat(r1)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x028f:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x020e }
            r1.<init>(r2)     // Catch:{ all -> 0x020e }
            goto L_0x00db
        L_0x0296:
            java.lang.String r2 = "TIT1"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x029e:
            java.lang.String r2 = "TCOM"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x02a6:
            java.lang.String r2 = "TIT2"
            avk r1 = m1812a(r1, r2, r12)     // Catch:{ all -> 0x020e }
            goto L_0x0058
        L_0x02ae:
            r12.mo2073c(r0)
            goto L_0x02b3
        L_0x02b2:
            throw r1
        L_0x02b3:
            goto L_0x02b2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aqj.m1810a(bky):atv");
    }

    /* renamed from: b */
    private static avk m1814b(int i, String str, bky bky) {
        int j = bky.mo2083j();
        if (bky.mo2083j() == 1684108385 && j >= 22) {
            bky.mo2075d(10);
            int e = bky.mo2076e();
            if (e > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(e);
                String sb2 = sb.toString();
                int e2 = bky.mo2076e();
                if (e2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(e2);
                    sb2 = sb3.toString();
                }
                return new avk(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(apu.m1769e(i));
        Log.w("MetadataUtil", valueOf2.length() == 0 ? new String("Failed to parse index/count attribute: ") : "Failed to parse index/count attribute: ".concat(valueOf2));
        return null;
    }

    /* renamed from: a */
    public static aqi m1809a(bky bky, int i, String str) {
        while (true) {
            int i2 = bky.f4259b;
            if (i2 >= i) {
                return null;
            }
            int j = bky.mo2083j();
            if (bky.mo2083j() != 1684108385) {
                bky.mo2073c(i2 + j);
            } else {
                int j2 = bky.mo2083j();
                int j3 = bky.mo2083j();
                int i3 = j - 16;
                byte[] bArr = new byte[i3];
                bky.mo2069a(bArr, 0, i3);
                return new aqi(str, bArr, j3, j2);
            }
        }
    }

    /* renamed from: a */
    private static avk m1812a(int i, String str, bky bky) {
        int j = bky.mo2083j();
        if (bky.mo2083j() == 1684108385) {
            bky.mo2075d(8);
            return new avk(str, null, bky.mo2079f(j - 16));
        }
        String valueOf = String.valueOf(apu.m1769e(i));
        Log.w("MetadataUtil", valueOf.length() == 0 ? new String("Failed to parse text attribute: ") : "Failed to parse text attribute: ".concat(valueOf));
        return null;
    }

    /* renamed from: a */
    private static avc m1811a(int i, String str, bky bky, boolean z, boolean z2) {
        int b = m1813b(bky);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String valueOf = String.valueOf(apu.m1769e(i));
            Log.w("MetadataUtil", valueOf.length() == 0 ? new String("Failed to parse uint8 attribute: ") : "Failed to parse uint8 attribute: ".concat(valueOf));
            return null;
        } else if (!z) {
            return new aux("und", str, Integer.toString(b));
        } else {
            return new avk(str, null, Integer.toString(b));
        }
    }

    /* renamed from: b */
    private static int m1813b(bky bky) {
        bky.mo2075d(4);
        if (bky.mo2083j() == 1684108385) {
            bky.mo2075d(8);
            return bky.mo2074d();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
