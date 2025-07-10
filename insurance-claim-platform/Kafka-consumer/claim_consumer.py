from kafka import KafkaConsumer

consumer = KafkaConsumer('claims-topic', bootstrap_servers='localhost:9092')
for message in consumer:
    print("Processing claim event:", message.value.decode())
