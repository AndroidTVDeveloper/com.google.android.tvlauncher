package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dcn */
/* compiled from: PG */
public final class dcn {

    /* renamed from: R */
    public static /* synthetic */ int f8234R;

    /* renamed from: S */
    private static final long f8235S = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: A */
    public dch f8236A = null;

    /* renamed from: B */
    public dai f8237B = null;

    /* renamed from: C */
    public int f8238C = -1;

    /* renamed from: D */
    public String f8239D = null;

    /* renamed from: E */
    public String f8240E = null;

    /* renamed from: F */
    public String f8241F = null;

    /* renamed from: G */
    public boolean f8242G;

    /* renamed from: H */
    public boolean f8243H;

    /* renamed from: I */
    public final ArraySet f8244I = new ArraySet(1);

    /* renamed from: J */
    public final List f8245J = new ArrayList();

    /* renamed from: K */
    public String f8246K = null;

    /* renamed from: L */
    public boolean f8247L = true;

    /* renamed from: M */
    public boolean f8248M = true;

    /* renamed from: N */
    public boolean f8249N = true;

    /* renamed from: O */
    public boolean f8250O = true;

    /* renamed from: P */
    public final List f8251P = new ArrayList();

    /* renamed from: Q */
    public final Map f8252Q = new HashMap();

    /* renamed from: T */
    private final List f8253T = new ArrayList(5);

    /* renamed from: U */
    private final HashMap f8254U = new HashMap(20);

    /* renamed from: V */
    private boolean f8255V = false;

    /* renamed from: W */
    private boolean f8256W = false;

    /* renamed from: X */
    private int f8257X = -1;

    /* renamed from: Y */
    private int f8258Y = -1;

    /* renamed from: Z */
    private final HashMap f8259Z = new HashMap();

    /* renamed from: a */
    public Uri f8260a = null;

    /* renamed from: aa */
    private final int f8261aa;

    /* renamed from: ab */
    private boolean f8262ab;

    /* renamed from: ac */
    private boolean f8263ac = false;

    /* renamed from: ad */
    private int f8264ad = -1;

    /* renamed from: ae */
    private final Context f8265ae;

    /* renamed from: af */
    private SharedPreferences f8266af;

    /* renamed from: b */
    public int f8267b = -1;

    /* renamed from: c */
    public boolean f8268c = false;

    /* renamed from: d */
    public Uri f8269d = null;

    /* renamed from: e */
    public String f8270e = null;

    /* renamed from: f */
    public boolean f8271f = true;

    /* renamed from: g */
    public String f8272g = null;

    /* renamed from: h */
    public boolean f8273h = false;

    /* renamed from: i */
    public Uri f8274i = null;

    /* renamed from: j */
    public boolean f8275j = true;

    /* renamed from: k */
    public boolean f8276k = false;

    /* renamed from: l */
    public String f8277l = "inputs";

    /* renamed from: m */
    public boolean f8278m = false;

    /* renamed from: n */
    public boolean f8279n = false;

    /* renamed from: o */
    public boolean f8280o = false;

    /* renamed from: p */
    public String f8281p = null;

    /* renamed from: q */
    public boolean f8282q;

    /* renamed from: r */
    public final List f8283r = new ArrayList(8);

    /* renamed from: s */
    public final List f8284s = new ArrayList(10);

    /* renamed from: t */
    public final List f8285t = new ArrayList(8);

    /* renamed from: u */
    public final List f8286u = new ArrayList(20);

    /* renamed from: v */
    public final List f8287v = new ArrayList(10);

    /* renamed from: w */
    public final List f8288w = new ArrayList(1);

    /* renamed from: x */
    public final List f8289x = new ArrayList(2);

    /* renamed from: y */
    public final List f8290y = new ArrayList(5);

    /* renamed from: z */
    public String f8291z = null;

    public dcn(Context context, int i) {
        boolean z;
        boolean z2;
        this.f8265ae = context;
        this.f8261aa = i;
        this.f8242G = false;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("oem_config", 0);
            this.f8266af = sharedPreferences;
            if (sharedPreferences.getLong("time_stamp", -1) != -1) {
                z = true;
            } else {
                z = false;
            }
            this.f8242G = z;
            this.f8262ab = this.f8266af.getBoolean("has_seen_sponsored_channels", false);
            if (i > this.f8266af.getInt("oem_config_package_ver", -1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f8266af.getBoolean("refresh_oem_configuration_data", false)) {
                this.f8266af.edit().putBoolean("refresh_oem_configuration_data", false).apply();
                z2 = true;
            }
            if (this.f8242G) {
                if (z2) {
                    m6143a(true);
                } else {
                    m6143a(false);
                    return;
                }
            }
            dcm dcm = new dcm(this, this.f8265ae);
            dcm.executeOnExecutor(daz.f8124a, new Void[0]);
            this.f8243H = true;
            new Handler().postDelayed(new dcl(this, dcm), f8235S);
        }
    }

    /* renamed from: b */
    public final void mo4122b(String str, String str2, boolean z) {
        if ((!z || !this.f8242G) && !this.f8286u.contains(str2)) {
            this.f8286u.add(str2);
            this.f8259Z.put(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4115a(String str, int i) {
        this.f8254U.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo4116a(String str, boolean z) {
        if ((!z || !this.f8242G) && !this.f8288w.contains(str)) {
            this.f8288w.add(str);
        }
    }

    /* renamed from: a */
    public final boolean mo4118a(String str, String str2, boolean z) {
        if ((z && this.f8242G) || this.f8285t.contains(str2) || this.f8289x.contains(str2)) {
            return false;
        }
        this.f8285t.add(str2);
        this.f8259Z.put(str2, str);
        return true;
    }

    /* renamed from: c */
    public final void mo4125c(String str, String str2, boolean z) {
        if ((!z || !this.f8242G) && !this.f8287v.contains(str2)) {
            this.f8287v.add(str2);
            this.f8259Z.put(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4117a(String str, String str2) {
        if (this.f8289x.contains(str2) || this.f8285t.contains(str2) || this.f8289x.size() >= 2) {
            return false;
        }
        this.f8289x.add(str2);
        this.f8259Z.put(str2, str);
        return true;
    }

    /* renamed from: a */
    private final void m6141a(dai dai) {
        this.f8252Q.put(dai.m6054a(dai.f8050a, dai.f8051b), dai);
    }

    /* renamed from: a */
    public final void mo4112a(dah dah, boolean z) {
        int i;
        boolean z2 = false;
        if (z && this.f8242G) {
            z2 = true;
        }
        if (!z2 || !this.f8262ab) {
            boolean z3 = dah.f8046d;
            if (z3) {
                this.f8263ac = true;
            }
            if (!z2) {
                if (TextUtils.isEmpty(dah.f8044b) || !this.f8252Q.containsKey(dai.m6054a(dah.f8043a, dah.f8044b))) {
                    dai dai = this.f8237B;
                    if (dai != null && TextUtils.equals(dai.f8050a, dah.f8043a)) {
                        Log.e("OemConfigurationData", "Live TV OOB channel order has already been defined.");
                        return;
                    }
                    int i2 = this.f8264ad + 1;
                    this.f8264ad = i2;
                    dah.f8045c = i2;
                    dai a = dah.mo4034a();
                    this.f8284s.add(a);
                    if (a.f8053d) {
                        this.f8245J.add(a);
                    }
                    m6141a(a);
                    return;
                }
                String str = dah.f8043a;
                String str2 = dah.f8044b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 92 + String.valueOf(str2).length());
                sb.append("channel with package = ");
                sb.append(str);
                sb.append(" with system_channel_key = ");
                sb.append(str2);
                sb.append(" has already appeared in out-of-box order.");
                Log.e("OemConfigurationData", sb.toString());
            } else if (z3) {
                if (this.f8252Q.containsKey(dai.m6054a(dah.f8043a, dah.f8044b))) {
                    i = this.f8284s.indexOf(dah.mo4034a());
                } else if (this.f8252Q.containsKey(dai.m6054a(dah.f8043a, null))) {
                    List list = this.f8284s;
                    dah dah2 = new dah();
                    dah2.f8043a = dah.f8043a;
                    dah2.f8044b = null;
                    i = list.indexOf(dah2.mo4034a());
                } else {
                    String str3 = dah.f8043a;
                    String str4 = dah.f8044b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 148 + String.valueOf(str4).length());
                    sb2.append("The sponsored channel is skipped because it did not exist before in the previous configuration with the same package name: ");
                    sb2.append(str3);
                    sb2.append(" and system_channel_key: ");
                    sb2.append(str4);
                    Log.e("OemConfigurationData", sb2.toString());
                    return;
                }
                if (i != -1) {
                    dah.f8045c = i;
                    dai a2 = dah.mo4034a();
                    this.f8284s.set(i, a2);
                    m6141a(a2);
                    this.f8245J.add(a2);
                    return;
                }
                String str5 = dah.f8043a;
                String str6 = dah.f8044b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 105 + String.valueOf(str6).length());
                sb3.append("The sponsored channel with package name: ");
                sb3.append(str5);
                sb3.append(" and system_channel_key: ");
                sb3.append(str6);
                sb3.append(" does not exist in out of box ordering.");
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4114a(String str) {
        if (!this.f8283r.contains(str)) {
            this.f8283r.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4124c(String str) {
        if (!this.f8290y.contains(str)) {
            this.f8290y.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4121b(String str) {
        if (!this.f8253T.contains(str)) {
            this.f8253T.add(str);
        }
    }

    /* renamed from: a */
    public final void mo4109a() {
        this.f8242G = true;
        this.f8243H = false;
        this.f8266af.edit().putInt("content_provider_query_count", 0).apply();
        for (dcj a : new ArraySet(this.f8244I)) {
            a.mo2708a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(int, boolean):void
     arg types: [int, int]
     candidates:
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dah, boolean):void
     arg types: [dah, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dah, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, java.lang.String, boolean):boolean
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      dcn.a(java.util.Collection, java.lang.String, android.content.SharedPreferences$Editor):void
      dcn.a(java.lang.String, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dch, boolean):void
     arg types: [dch, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dch, boolean):void */
    /* renamed from: a */
    private final void m6143a(boolean z) {
        String str;
        JSONArray jSONArray;
        dah dah;
        String str2 = null;
        String string = this.f8266af.getString("live_tv_channel_out_of_box_package_name", null);
        boolean z2 = false;
        if (string != null) {
            mo4126d(string, this.f8266af.getString("live_tv_channel_out_of_box_system_channel_key", null), false);
            mo4111a(this.f8266af.getInt("live_tv_channel_out_of_box_position", -1), false);
        }
        String string2 = this.f8266af.getString("channels_out_of_box_ordering", null);
        if (!TextUtils.isEmpty(string2)) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(string2)) {
                try {
                    JSONArray jSONArray2 = new JSONArray(string2);
                    int i = 0;
                    while (i < jSONArray2.length()) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i);
                        try {
                            String string3 = jSONObject.getString("pkgName");
                            String optString = jSONObject.optString("sysChannelKey", str2);
                            int i2 = jSONObject.getInt("chanPos");
                            boolean z3 = jSONObject.getBoolean("isSponsored");
                            boolean optBoolean = jSONObject.optBoolean("isGoogleConfig", z2);
                            boolean z4 = jSONObject.getBoolean("canMoveChannel");
                            boolean z5 = jSONObject.getBoolean("canHideChannel");
                            jSONArray = jSONArray2;
                            try {
                                dah = new dah();
                                dah.f8043a = string3;
                                dah.f8044b = optString;
                                dah.f8045c = i2;
                                dah.f8046d = z3;
                                dah.f8047e = optBoolean;
                                dah.f8048f = z4;
                                dah.f8049g = z5;
                            } catch (JSONException e) {
                            }
                        } catch (JSONException e2) {
                            jSONArray = jSONArray2;
                            String valueOf = String.valueOf(jSONObject);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("JSONException. Could not deserialize jsonObject: ");
                            sb.append(valueOf);
                            Log.e("ChannelInfo", sb.toString());
                            dah = null;
                            arrayList.add(dah);
                            i++;
                            jSONArray2 = jSONArray;
                            str2 = null;
                            z2 = false;
                        }
                        arrayList.add(dah);
                        i++;
                        jSONArray2 = jSONArray;
                        str2 = null;
                        z2 = false;
                    }
                } catch (JSONException e3) {
                    String valueOf2 = String.valueOf(string2);
                    Log.e("ChannelInfo", valueOf2.length() == 0 ? new String("JSONException in fromJson. Could not deserialize from jsonArrayStr: ") : "JSONException in fromJson. Could not deserialize from jsonArrayStr: ".concat(valueOf2));
                }
            }
            if (arrayList.isEmpty()) {
                for (String str3 : string2.split(",\\|,")) {
                    int indexOf = str3.indexOf(":");
                    if (indexOf != -1) {
                        String substring = str3.substring(0, indexOf);
                        str = str3.substring(indexOf + 1);
                        str3 = substring;
                    } else {
                        str = null;
                    }
                    dah dah2 = new dah();
                    dah2.f8043a = str3;
                    dah2.f8044b = str;
                    mo4112a(dah2, false);
                }
                this.f8266af.edit().putString("channels_out_of_box_ordering", dai.m6055a(this.f8284s).toString()).apply();
            } else {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    mo4112a((dah) arrayList.get(i3), false);
                }
            }
        }
        HashMap hashMap = new HashMap();
        String string4 = this.f8266af.getString("appname_package_map", null);
        if (string4 != null) {
            String[] split = string4.split(",\\|,");
            if (split.length > 1) {
                for (int i4 = 0; i4 < split.length; i4 += 2) {
                    hashMap.put(split[i4], split[i4 + 1]);
                }
            }
        }
        String string5 = this.f8266af.getString("favorite_apps_out_of_box_ordering", null);
        if (string5 != null) {
            for (String str4 : string5.split(",\\|,")) {
                String str5 = (String) hashMap.get(str4);
                if (str5 != null) {
                    mo4118a(str5, str4, false);
                }
            }
        }
        String string6 = this.f8266af.getString("all_apps_out_of_box_ordering", null);
        if (string6 != null) {
            for (String str6 : string6.split(",\\|,")) {
                String str7 = (String) hashMap.get(str6);
                if (str7 != null) {
                    mo4122b(str7, str6, false);
                }
            }
        }
        String string7 = this.f8266af.getString("games_out_of_box_ordering", null);
        if (string7 != null) {
            for (String str8 : string7.split(",\\|,")) {
                String str9 = (String) hashMap.get(str8);
                if (str9 != null) {
                    mo4125c(str9, str8, false);
                }
            }
        }
        String string8 = this.f8266af.getString("configure_channels_app_ordering", null);
        if (string8 != null) {
            for (String a : string8.split(",\\|,")) {
                mo4116a(a, false);
            }
        }
        mo4113a(dch.m6120a(this.f8266af.getString("apps_view_layout_option_tag", null)), false);
        if (!z) {
            String string9 = this.f8266af.getString("search_icon", null);
            this.f8260a = string9 != null ? Uri.parse(string9) : null;
            if (this.f8266af.contains("search_orb_focused_color")) {
                mo4110a(this.f8266af.getInt("search_orb_focused_color", 0));
            }
            String string10 = this.f8266af.getString("inputs_icon", null);
            this.f8274i = string10 != null ? Uri.parse(string10) : null;
            String string11 = this.f8266af.getString("bundled_tuner_banner", null);
            this.f8269d = string11 != null ? Uri.parse(string11) : null;
            this.f8270e = this.f8266af.getString("bundled_tuner_title", null);
            if (this.f8266af.contains("disable_disconnected_inputs")) {
                this.f8271f = this.f8266af.getBoolean("disable_disconnected_inputs", true);
            }
            if (this.f8266af.contains("enable_input_state_icon")) {
                this.f8273h = this.f8266af.getBoolean("enable_input_state_icon", false);
            }
            if (this.f8266af.contains("apply_standard_style_to_input_state_icons")) {
                this.f8275j = this.f8266af.getBoolean("apply_standard_style_to_input_state_icons", true);
            }
            if (this.f8266af.contains("show_inputs")) {
                this.f8276k = this.f8266af.getBoolean("show_inputs", false);
            }
            if (this.f8266af.contains("inputs_panel_label_option")) {
                this.f8277l = this.f8266af.getString("inputs_panel_label_option", null);
            }
            if (this.f8266af.contains("show_physical_inputs_separately")) {
                this.f8278m = this.f8266af.getBoolean("show_physical_inputs_separately", false);
            }
            if (this.f8266af.contains("use_custom_input_list")) {
                this.f8279n = this.f8266af.getBoolean("use_custom_input_list", false);
            }
            String string12 = this.f8266af.getString("home_screen_inputs_ordering", null);
            if (string12 != null) {
                for (String a2 : string12.split(",\\|,")) {
                    mo4114a(a2);
                }
            }
            String string13 = this.f8266af.getString("package_notification_whitelist", null);
            if (string13 != null) {
                for (String b : string13.split(",\\|,")) {
                    mo4121b(b);
                }
            }
            String string14 = this.f8266af.getString("app_channel_quota", null);
            if (string14 != null) {
                String[] split2 = string14.split(",\\|,");
                if (split2.length > 1) {
                    for (int i5 = 0; i5 < split2.length; i5 += 2) {
                        try {
                            mo4115a(split2[i5], Integer.decode(split2[i5 + 1]).intValue());
                        } catch (NumberFormatException e4) {
                            String valueOf3 = String.valueOf(split2[i5 + 1]);
                            Log.e("OemConfigurationData", valueOf3.length() == 0 ? new String("Bad quota number: ") : "Bad quota number: ".concat(valueOf3));
                        }
                    }
                }
            }
            this.f8291z = this.f8266af.getString("headsup_notifications_font", null);
            if (this.f8266af.contains("headsup_notifications_text_color")) {
                mo4120b(this.f8266af.getInt("headsup_notifications_text_color", 0));
            }
            if (this.f8266af.contains("headsup_notifications_background_color")) {
                mo4123c(this.f8266af.getInt("headsup_notifications_background_color", 0));
            }
            this.f8239D = this.f8266af.getString("headsup_notifications_location", null);
            if (this.f8266af.contains("force_launch_package_after_boot")) {
                this.f8280o = this.f8266af.getBoolean("force_launch_package_after_boot", false);
            }
            this.f8281p = this.f8266af.getString("package_name_launch_after_boot", null);
            this.f8282q = this.f8266af.getBoolean("use_main_intent", false);
            String string15 = this.f8266af.getString("pinned_favorite_apps", null);
            if (string15 != null) {
                for (String str10 : string15.split(",\\|,")) {
                    String str11 = (String) hashMap.get(str10);
                    if (str11 != null) {
                        mo4117a(str11, str10);
                    }
                }
            }
            String string16 = this.f8266af.getString("hidden_uninstall_package_list", null);
            if (string16 != null) {
                for (String c : string16.split(",\\|,")) {
                    mo4124c(c);
                }
            }
            if (this.f8266af.contains("home_background_uri")) {
                this.f8246K = this.f8266af.getString("home_background_uri", null);
            }
            if (this.f8266af.contains("app_recommendations_content_provider_package")) {
                this.f8240E = this.f8266af.getString("app_recommendations_content_provider_package", null);
            }
            if (this.f8266af.contains("widget_content_provider_package")) {
                this.f8241F = this.f8266af.getString("widget_content_provider_package", null);
            }
            if (this.f8266af.contains("show_add_to_watch_next_from_program_menu")) {
                this.f8247L = this.f8266af.getBoolean("show_add_to_watch_next_from_program_menu", true);
            }
            if (this.f8266af.contains("show_remove_program_from_program_menu")) {
                this.f8248M = this.f8266af.getBoolean("show_remove_program_from_program_menu", true);
            }
            if (this.f8266af.contains("watch_next_channel_enabled_by_default")) {
                this.f8249N = this.f8266af.getBoolean("watch_next_channel_enabled_by_default", true);
            }
            if (this.f8266af.contains("watch_next_channel_auto_hide_enabled_2")) {
                this.f8250O = this.f8266af.getBoolean("watch_next_channel_auto_hide_enabled_2", true);
            }
        }
    }

    /* renamed from: b */
    public final void mo4119b() {
        boolean z;
        SharedPreferences.Editor edit = this.f8266af.edit();
        edit.clear();
        edit.putLong("time_stamp", System.currentTimeMillis());
        Uri uri = this.f8260a;
        if (uri != null) {
            edit.putString("search_icon", uri.toString());
        }
        if (this.f8268c) {
            edit.putInt("search_orb_focused_color", this.f8267b);
        }
        Uri uri2 = this.f8274i;
        if (uri2 != null) {
            edit.putString("inputs_icon", uri2.toString());
        }
        Uri uri3 = this.f8269d;
        if (uri3 != null) {
            edit.putString("bundled_tuner_banner", uri3.toString());
        }
        edit.putString("bundled_tuner_title", this.f8270e);
        edit.putBoolean("disable_disconnected_inputs", this.f8271f);
        edit.putBoolean("enable_input_state_icon", this.f8273h);
        edit.putBoolean("show_inputs", this.f8276k);
        edit.putString("inputs_panel_label_option", this.f8277l);
        edit.putBoolean("show_physical_inputs_separately", this.f8278m);
        edit.putBoolean("use_custom_input_list", this.f8279n);
        m6142a(this.f8283r, "home_screen_inputs_ordering", edit);
        m6142a(this.f8253T, "package_notification_whitelist", edit);
        dai dai = this.f8237B;
        if (dai != null) {
            edit.putString("live_tv_channel_out_of_box_package_name", dai.f8050a);
            edit.putString("live_tv_channel_out_of_box_system_channel_key", this.f8237B.f8051b);
            edit.putInt("live_tv_channel_out_of_box_position", this.f8238C);
        }
        edit.putString("channels_out_of_box_ordering", dai.m6055a(this.f8284s).toString());
        if (this.f8262ab || this.f8263ac) {
            z = true;
        } else {
            z = false;
        }
        this.f8262ab = z;
        edit.putBoolean("has_seen_sponsored_channels", z);
        if (!this.f8259Z.isEmpty()) {
            StringBuilder sb = new StringBuilder(128);
            for (Map.Entry entry : this.f8259Z.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(",|,");
                sb.append((String) entry.getValue());
                sb.append(",|,");
            }
            edit.putString("appname_package_map", sb.toString());
        }
        m6142a(this.f8285t, "favorite_apps_out_of_box_ordering", edit);
        m6142a(this.f8286u, "all_apps_out_of_box_ordering", edit);
        m6142a(this.f8287v, "games_out_of_box_ordering", edit);
        m6142a(this.f8288w, "configure_channels_app_ordering", edit);
        m6142a(this.f8289x, "pinned_favorite_apps", edit);
        m6142a(this.f8290y, "hidden_uninstall_package_list", edit);
        if (!this.f8254U.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(128);
            for (Map.Entry entry2 : this.f8254U.entrySet()) {
                sb2.append((String) entry2.getKey());
                sb2.append(",|,");
                sb2.append(entry2.getValue());
                sb2.append(",|,");
            }
            edit.putString("app_channel_quota", sb2.toString());
        }
        edit.putString("headsup_notifications_font", this.f8291z);
        if (this.f8255V) {
            edit.putInt("headsup_notifications_text_color", this.f8257X);
        }
        if (this.f8256W) {
            edit.putInt("headsup_notifications_background_color", this.f8258Y);
        }
        edit.putString("headsup_notifications_location", this.f8239D);
        dch dch = this.f8236A;
        if (dch != null) {
            edit.putString("apps_view_layout_option_tag", dch.f8223b);
        }
        if (this.f8280o) {
            edit.putBoolean("force_launch_package_after_boot", true);
        }
        String str = this.f8281p;
        if (str != null) {
            edit.putString("package_name_launch_after_boot", str);
        }
        edit.putBoolean("use_main_intent", this.f8282q);
        edit.putString("home_background_uri", this.f8246K);
        edit.putString("app_recommendations_content_provider_package", this.f8240E);
        edit.putString("widget_content_provider_package", this.f8241F);
        edit.putBoolean("show_add_to_watch_next_from_program_menu", this.f8247L);
        edit.putBoolean("show_remove_program_from_program_menu", this.f8248M);
        edit.putBoolean("watch_next_channel_enabled_by_default", this.f8249N);
        edit.putBoolean("watch_next_channel_auto_hide_enabled_2", this.f8250O);
        edit.putInt("oem_config_package_ver", this.f8261aa);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo4113a(dch dch, boolean z) {
        if (!z || !this.f8242G) {
            this.f8236A = dch;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4123c(int i) {
        this.f8258Y = i;
        this.f8256W = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4120b(int i) {
        this.f8257X = i;
        this.f8255V = true;
    }

    /* renamed from: a */
    public final void mo4111a(int i, boolean z) {
        if (!z || !this.f8242G) {
            this.f8238C = i;
        }
    }

    /* renamed from: d */
    public final void mo4126d(String str, String str2, boolean z) {
        if (!z || !this.f8242G) {
            List list = this.f8284s;
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!((dai) list.get(i)).f8050a.equals(str)) {
                    i = i2;
                } else {
                    Log.e("OemConfigurationData", "Live TV Package cannot be declared in both live channel out-of-box ordering and channels out-of-box ordering.");
                    return;
                }
            }
            dah dah = new dah();
            dah.f8043a = str;
            dah.f8044b = str2;
            this.f8237B = dah.mo4034a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4110a(int i) {
        this.f8267b = i;
        this.f8268c = true;
    }

    /* renamed from: a */
    private static void m6142a(Collection collection, String str, SharedPreferences.Editor editor) {
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder(128);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",|,");
            }
            editor.putString(str, sb.toString());
        }
    }
}
