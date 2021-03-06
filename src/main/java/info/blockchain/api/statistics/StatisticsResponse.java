package info.blockchain.api.statistics;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * This class is used as a response object to the 'get' method in the 'Statistics' class
 *
 */
public class StatisticsResponse
{
	private double tradeVolumeBTC;
	private double tradeVolumeUSD;
	private double minersRevenueBTC;
	private double minersRevenueUSD;
	private double marketPriceUSD;
	private double estimatedTransactionVolumeUSD;
	private long totalFeesBTC;
	private long totalBTCSent;
	private long estimatedBTCSent;
	private long btcMined;
	private double difficulty;
	private double minutesBetweenBlocks;
	private double daysDestroyed;
	private long numberOfTransactions;
	private double hashRate;
	private long timestamp;
	private long minedBlocks;
	private long blocksSize;
	private long totalBTC;
	private long totalBlocks;
	private long nextRetarget;
	
	public StatisticsResponse(String jsonString)
	{
		JsonObject s = new JsonParser().parse(jsonString).getAsJsonObject();
		
		this.tradeVolumeBTC = s.get("trade_volume_btc").getAsDouble();
		this.tradeVolumeUSD = s.get("trade_volume_usd").getAsDouble();
		this.minersRevenueBTC = s.get("miners_revenue_btc").getAsDouble();
		this.minersRevenueUSD = s.get("miners_revenue_usd").getAsDouble();
		this.marketPriceUSD = s.get("market_price_usd").getAsDouble();
		this.estimatedTransactionVolumeUSD = s.get("estimated_transaction_volume_usd").getAsDouble();
		this.totalFeesBTC = s.get("total_fees_btc").getAsLong();
		this.totalBTCSent = s.get("total_btc_sent").getAsLong();
		this.estimatedBTCSent = s.get("estimated_btc_sent").getAsLong();
		this.btcMined = s.get("n_btc_mined").getAsLong();
		this.difficulty = s.get("difficulty").getAsDouble();
		this.minutesBetweenBlocks = s.get("minutes_between_blocks").getAsDouble();
		this.daysDestroyed = s.get("days_destroyed").getAsDouble();
		this.numberOfTransactions = s.get("n_tx").getAsLong();
		this.hashRate = s.get("hash_rate").getAsDouble();
		this.timestamp = s.get("timestamp").getAsLong();
		this.minedBlocks = s.get("n_blocks_mined").getAsLong();
		this.blocksSize = s.get("blocks_size").getAsLong();
		this.totalBTC = s.get("totalbc").getAsLong();
		this.totalBlocks = s.get("n_blocks_total").getAsLong();
		this.nextRetarget = s.get("nextretarget").getAsLong();
	}
	
	/**
	 * @return Trade volume in the past 24 hours
	 */
	public double getTradeVolumeBTC()
	{
		return tradeVolumeBTC;
	}
	/**
	 * @return Trade volume in the past 24 hours
	 */
	public double getTradeVolumeUSD()
	{
		return tradeVolumeUSD;
	}
	/**
	 * @return Miners' revenue in BTC
	 */
	public double getMinersRevenueBTC()
	{
		return minersRevenueBTC;
	}
	/**
	 * @return Miners' revenue in USD
	 */
	public double getMinersRevenueUSD()
	{
		return minersRevenueUSD;
	}
	/**
	 * @return Current market price in USD
	 */
	public double getMarketPriceUSD()
	{
		return marketPriceUSD;
	}
	/**
	 * @return Estimated transaction volume in the past 24 hours
	 */
	public double getEstimatedTransactionVolumeUSD()
	{
		return estimatedTransactionVolumeUSD;
	}
	/**
	 * @return Total fees in the past 24 hours (in satoshi)
	 */
	public long getTotalFeesBTC()
	{
		return totalFeesBTC;
	}
	/**
	 * @return Total BTC sent in the past 24 hours (in satoshi)
	 */
	public long getTotalBTCSent()
	{
		return totalBTCSent;
	}
	/**
	 * @return Estimated BTC sent in the past 24 hours (in satoshi)
	 */
	public long getEstimatedBTCSent()
	{
		return estimatedBTCSent;
	}
	/**
	 * @return Number of BTC mined in the past 24 hours (in satoshi)
	 */
	public long getBTCMined()
	{
		return btcMined;
	}
	/**
	 * @return Current difficulty
	 */
	public double getDifficulty()
	{
		return difficulty;
	}
	/**
	 * @return Minutes between blocks
	 */
	public double getMinutesBetweenBlocks()
	{
		return minutesBetweenBlocks;
	}
	/**
	 * @return Days destroyed in the past 24 hours
	 */
	public double getDaysDestroyed()
	{
		return daysDestroyed;
	}
	/**
	 * @return Number of transactions in the past 24 hours
	 */
	public long getNumberOfTransactions()
	{
		return numberOfTransactions;
	}
	/**
	 * @return Current hashrate in GH/s
	 */
	public double getHashRate()
	{
		return hashRate;
	}
	/**
	 * @return Timestamp of when this report was compiled (in ms)
	 */
	public long getTimestamp()
	{
		return timestamp;
	}
	/**
	 * @return Number of blocks mined in the past 24 hours
	 */
	public long getMinedBlocks()
	{
		return minedBlocks;
	}
	/**
	 * @return the blocksSize
	 */
	public long getBlocksSize()
	{
		return blocksSize;
	}
	/**
	 * @return Total BTC in existence (in satoshi)
	 */
	public long getTotalBTC()
	{
		return totalBTC;
	}
	/**
	 * @return Total number of blocks in existence (in satoshi)
	 */
	public long getTotalBlocks()
	{
		return totalBlocks;
	}
	/**
	 * @return The next block height where the difficulty retarget will occur
	 */
	public long getNextRetarget()
	{
		return nextRetarget;
	}
}
