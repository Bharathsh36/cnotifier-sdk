package net.cryptonotifier.notifier.api.client.config;

public class NotifierApiConfig {
  /**
   * Base domain for URLs.
   */
  private static String BASE_DOMAIN = "cryptonotifier.net";


  /**
   * Set the URL base domain name (e.g., binance.com).
   *
   * @param baseDomain Base domain name
   */
  public static void setBaseDomain(final String baseDomain) {
    BASE_DOMAIN = baseDomain;
  }

  /**
   * Get the URL base domain name (e.g., binance.com).
   *
   * @return The base domain for URLs
   */
  public static String getBaseDomain() {
    return BASE_DOMAIN;
  }

  /**
   * REST API base URL.
   */
  public static String getApiBaseUrl() {
    return String.format("https://api.%s", getBaseDomain());
  }

}
